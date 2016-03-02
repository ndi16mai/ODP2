package gui;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Wareus on 2016-02-24.
 */
public class Assets
{
    public static Image hull, engine, wings, hell;

    public static void load()
    {
        hell = loadImage("assets/hell.jpg");
        hull = loadImage("assets/Hull.png");
        engine = loadImage("assets/Engine.png");
        wings = loadImage("assets/Wings.png");
    }

    private static Image loadImage(String path)
    {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SwingFXUtils.toFXImage(bufferedImage, null);
    }
}
