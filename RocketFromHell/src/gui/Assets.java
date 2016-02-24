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
    public static Image rocket;

    public static void load()
    {
        rocket = loadImage("assets/test_rocket.png");
    }

    private static Image loadImage(String path)
    {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SwingFXUtils.toFXImage(bufferedImage, null);//new Image("assest/test_rocket.png");
    }
}
