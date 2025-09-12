package net.vincent.PopStar;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Tiles {

    public BufferedImage[] starTiles;

    public Tiles(){
        starTiles = new BufferedImage[5];
        try {
            starTiles[0] = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/blue.png")));
            starTiles[1] = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/green.png")));
            starTiles[2] = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/purple.png")));
            starTiles[3] = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/red.png")));
            starTiles[4] = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/yellow.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
