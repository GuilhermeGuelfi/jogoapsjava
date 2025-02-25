package entidades.interativos;

import Mundo.Camera;
import entidades.Entity;
import entidades.solidos.Solido;
import main.Game;
import java.awt.*;
import java.awt.image.BufferedImage;


public class Inimigo extends Entity {

    // velocidade de deslocamento do inimigo
    // pode mudar de acordo com o inimigo
    public double speed = 0.5;

    // se o inimigo está ou não se movimentando
    // 1 = movimento
    // 0 = parado
    // (poderia ser usado boolean)
    public int movimentacao = 1;

    // ajusta o tipo de inimigo
    public int tipoInimigo;

    // tamanho base dos inimigos
    public static int SIZEENEMYX = 16, SIZEENEMYY = 16;

    // frames = momento inicial dos frames do inimigo (para loop)
    // maxFrames = numero máximo de frames para reinicio do loop
    // index = index inicial na array de frames
    // maxIndex, informa o numero máximo de posicoes da array de animacao
    public int frames = 0, maxFrames = 7, index = 0, maxIndex = 3;

    // mascara de posicionamento do inimigo
    // nesse spritesheet inicial, o sprite está em 16 x 16 (vai mudar pra 64 x 128)
    public int maskx = 0, masky = 0, maskw = SIZEENEMYX, maskh = SIZEENEMYY;

    // vida do inimigo
    // life = vida inicial
    // maxLife = vida máxima (poderá ser removido)
    public int life = 5;

    // repassa a imagem carregada do inimigo
    public BufferedImage[] inimigo;

    public int identificadorUnico;

    // construtor de inimigo
    // passa a posicao inicial (x,Y)
    // tamanho, altura
    // e sprite a ser usado
    // herda de entidade
    public Inimigo(int identificadorUnico, int x, int y, int width, int height, int tipoInimigo, BufferedImage sprite) {

        super(x, y, width, height, sprite);

        this.identificadorUnico = identificadorUnico;
        this.tipoInimigo = tipoInimigo;

        // aqui eu crio a array responsável pelas imagens de movimento do inimigo
        // nesse caso, existem 3 posições (ver spritesheet)

        if (tipoInimigo == 1) {

            inimigo = new BufferedImage[4];

            // populo array por loop, passando a posição dele e tamanho de acordo com o sprite
            for (int i = 0; i < 4; i++) {
                inimigo[i] = Game.spriteEnemy.getSprite((i * SIZEENEMYX), 0, SIZEENEMYX, SIZEENEMYY);
            }
        } else if (tipoInimigo == 2){
            inimigo = new BufferedImage[4];

            // populo array por loop, passando a posição dele e tamanho de acordo com o sprite
            for (int i = 0; i < 4; i++) {
                inimigo[i] = Game.spriteEnemy.getSprite((i * SIZEENEMYX), 16, SIZEENEMYX, SIZEENEMYY);
            }
        }
    }

    // relatico a cada atualização de tela
    public void tick() {

        // geralmenet pode começar parado
        // movimentacao = 0;

        // inicia a colisão com objetos solidos
        if (!colisao((int) x, (int) (y + 1))) {
            y += 2;
        }

        // tenta se movimentar para a posição onde está o player... pode ser melhorado
        // nesse caso movimenta para a ESQUERDA
        if (Game.player.getX() < this.getX() && !colisao((int) (x - speed), this.getY())) {
            x -= speed;
            // movimentacao =1;
        }

        // nesse caso movimenta o inimigo para a DIREITA
        if (Game.player.getX() > this.getX() && !colisao((int) (x + speed), this.getY())) {
            x += speed;
            // movimentacao =1;
        }

        // ativa a funcionalidade de loop de imagens quando o inimigo está se movimentando
        if (movimentacao == 1) {
            frames++;
            if (frames == maxFrames) {
                index++;
                frames = 0;
                if (index > maxIndex) {
                    index = 0;
                }
            }
        }

    }

    // responsável por renderizar a imagem
    public void render(Graphics g) {
        g.drawImage(inimigo[index], this.getX() - Camera.x, this.getY() - Camera.y, null);

    }

    // função para colisão do inimigo
    public boolean colisao(int nextx, int nexty) {
        // prepara um retângulo da entidade inimigo
        Rectangle inimigo = new Rectangle(nextx + maskx, nexty + masky, maskw, maskh);

        // para cada entidade, checar se tem intersect com solido e puxa o inimigo em direção ao chão (solido)
        for (int i = 0; i < Game.entidades.size(); i++) {
            Entity entidade = Game.entidades.get(i);
            if (entidade instanceof Solido) {
                Rectangle solido = new Rectangle(entidade.getX() + maskx, entidade.getY() + masky, Entity.SIZEENTITYX, Entity.SIZEENTITYY);
                if (inimigo.intersects(solido)) {
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Inimigo{" +
                "identificadorUnico=" + identificadorUnico +
                ", tipoInimigo=" + tipoInimigo +
                ", life=" + life +
                ", speed=" + speed +
                ", movimentacao=" + movimentacao +
                ", frames=" + frames +
                ", maxFrames=" + maxFrames +
                ", index=" + index +
                ", maxIndex=" + maxIndex +
                ", maskx=" + maskx +
                ", masky=" + masky +
                ", maskw=" + maskw +
                ", maskh=" + maskh +
                '}';
    }
}
