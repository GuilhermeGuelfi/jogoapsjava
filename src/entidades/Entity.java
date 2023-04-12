package entidades;

import Mundo.Camera;
import main.Game;

import java.awt.*;
import java.awt.image.BufferedImage;

// classse muito importante
// gerencia aspectos de comportamentos das entidades


public class Entity {

    // posições das entidades no sprite x, y
    static int[] posChaoNucleo = {32, 64}, posChaoIsoladoTopo = {96, 0}, posChaoIsoladoFundo = {96, 96},
            posNucleoBifurcaChaoIsoladoTopo = {96, 32}, posNucleoBifurcaChaoIsoladoFundo = {96, 64},
            posNucleoConverteDireitaChaoIsoladoTopo = {128, 32}, posNucleoConverteEsquerdaChaoIsoladoTopo = {160, 32},
            posNucleoConverteDireitaChaoIsoladoFundo = {128, 64}, posNucleoConverteEsquerdaChaoIsoladoFundo = {160, 64},
            posChaoEsquerdoTopo = {0, 32}, posChaoEsquerdo = {0, 64}, posChaoDireitoTopo = {64, 32},
            posChaoDireito = {64, 64}, posChaoNormalTopo = {32, 32}, posChaoNormalFundo = {32, 96},
            posChaoEsquerdoFundo = {0, 96}, posChaoDireitoFundo = {64, 96}, posTijoloDeserto = {32, 0},
            posEmpty = {0, 0}, posGrama = {0, 160}, posEscadaTopo = {0, 192}, posEscada = {32, 192},
            posEscadaBase = {64, 192}, posEspinho = {0, 128}, posGalhoSeco = {32, 160}, posKitHealth = {64, 160},
            posSavePoint = {64, 128}, posTrashBag = {32,128};
    // ajustar ceu e nuvens
    // ajustar inimigo

    public static int SIZEENTITYX = 32, SIZEENTITYY = 32;

    // buffer de todas as entidades e seus posicionamentos no sprite)
    public static BufferedImage chaoNucleo = Game.sprite.getSprite(posChaoNucleo[0], posChaoNucleo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage chaoIsoladoTopo = Game.sprite.getSprite(posChaoIsoladoTopo[0], posChaoIsoladoTopo[1], SIZEENTITYX, SIZEENTITYY);

    public static BufferedImage chaoIsoladoFundo = Game.sprite.getSprite(posChaoIsoladoFundo[0], posChaoIsoladoFundo[1], SIZEENTITYX, SIZEENTITYY);

    public static BufferedImage nucleoBifurcaChaoIsoladoTopo = Game.sprite.getSprite(posNucleoBifurcaChaoIsoladoTopo[0], posNucleoBifurcaChaoIsoladoTopo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage nucleoBifurcaChaoIsoladoFundo = Game.sprite.getSprite(posNucleoBifurcaChaoIsoladoFundo[0], posNucleoBifurcaChaoIsoladoFundo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage nucleoConverteDireitaChaoIsoladoTopo = Game.sprite.getSprite(posNucleoConverteDireitaChaoIsoladoTopo[0], posNucleoConverteDireitaChaoIsoladoTopo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage nucleoConverteEsquerdaChaoIsoladoTopo = Game.sprite.getSprite(posNucleoConverteEsquerdaChaoIsoladoTopo[0], posNucleoConverteEsquerdaChaoIsoladoTopo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage nucleoConverteDireitaChaoIsoladoFundo = Game.sprite.getSprite(posNucleoConverteDireitaChaoIsoladoFundo[0], posNucleoConverteDireitaChaoIsoladoTopo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage nucleoConverteEsquerdaChaoIsoladoFundo = Game.sprite.getSprite(posNucleoConverteEsquerdaChaoIsoladoFundo[0], posNucleoConverteEsquerdaChaoIsoladoTopo[1], SIZEENTITYX, SIZEENTITYY);

    public static BufferedImage chaoEsquerdoTopo = Game.sprite.getSprite(posChaoEsquerdoTopo[0], posChaoEsquerdoTopo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage chaoEsquerdo = Game.sprite.getSprite(posChaoEsquerdo[0], posChaoEsquerdo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage chaoDireitoTopo = Game.sprite.getSprite(posChaoDireitoTopo[0], posChaoDireitoTopo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage chaoDireito = Game.sprite.getSprite(posChaoDireito[0], posChaoDireito[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage chaoNormalTopo = Game.sprite.getSprite(posChaoNormalTopo[0], posChaoNormalTopo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage chaoNormalFundo = Game.sprite.getSprite(posChaoNormalFundo[0], posChaoNormalFundo[1], SIZEENTITYX, SIZEENTITYY);

    public static BufferedImage chaoDireitoFundo = Game.sprite.getSprite(posChaoDireitoFundo[0], posChaoDireitoFundo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage chaoEsquerdoFundo = Game.sprite.getSprite(posChaoEsquerdoFundo[0], posChaoEsquerdoFundo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage tijoloDeserto = Game.sprite.getSprite(posTijoloDeserto[0], posTijoloDeserto[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage empty = Game.sprite.getSprite(posEmpty[0], posEmpty[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage ceu = Game.ceu.getSprite(0, 0, 3200, 800);
    public static BufferedImage nuvens = Game.nuvens.getSprite(0, 0, 1471, 700);
    public static BufferedImage grama = Game.sprite.getSprite(posGrama[0], posGrama[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage escadaTopo = Game.sprite.getSprite(posEscadaTopo[0], posEscadaTopo[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage escada = Game.sprite.getSprite(posEscada[0], posEscada[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage escadaBase = Game.sprite.getSprite(posEscadaBase[0], posEscadaBase[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage espinho = Game.sprite.getSprite(posEspinho[0], posEspinho[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage galhoSeco = Game.sprite.getSprite(posGalhoSeco[0], posGalhoSeco[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage inimigo = Game.spriteEnemy.getSprite(0, 0, SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage kitHealth = Game.sprite.getSprite(posKitHealth[0], posKitHealth[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage trashBag = Game.sprite.getSprite(posTrashBag[0], posTrashBag[1], SIZEENTITYX, SIZEENTITYY);
    public static BufferedImage save = Game.sprite.getSprite(posSavePoint[0], posSavePoint[1], SIZEENTITYX, SIZEENTITYY);

    // posicionamento das entidades (public)
    public double x, y;
    // tamanho
    protected int width, height;
    //sprite
    protected BufferedImage sprite;

    // construtor
    public Entity(int x, int y, int width, int height, BufferedImage sprite) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.sprite = sprite;
    }

    // ticks de entidades (repassam o comportamento para as entidades específicas)
    public void tick() {
    }

    /* Colisor (old - remover depois)
    public static boolean isColidding(Entity e1, Entity e2){
        Rectangle e1mask = new Rectangle(e1.getX() + e1.maskx, e1.getY() + e1.masky, e1.mwidth, e1.mheight);
        Rectangle e2mask = new Rectangle(e2.getX() + e2.maskx, e2.getY() + e2.masky, e2.mwidth, e2.mheight);
        return e1mask.intersects(e2mask);
    }
    */

    // render das entidades (em relação ao player)
    public void render(Graphics g) {

        g.drawImage(sprite, this.getX() - Camera.x, this.getY() - Camera.y, null);

    }

    // getters and setters

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public int getX() {
        return (int) this.x;
    }

    public int getY() {
        return (int) this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", sprite=" + sprite +
                '}';
    }
}
