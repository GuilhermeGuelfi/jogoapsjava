package entidades.interativos;

import entidades.Entity;
import java.awt.image.BufferedImage;

// escada (não solido) especial, habilita sobre e desce
public class Escada extends Entity {

    public int tipoEscada;

    public Escada(int x, int y, int width, int height, int tipoEscada,  BufferedImage sprite) {
        super(x, y, width, height, sprite);
        this.tipoEscada = tipoEscada;
    }


}


