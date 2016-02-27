package gui.util;

import javafx.beans.NamedArg;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Wareus on 2016-02-26.
 */
public class ImageBuilder
{
    Image image;

    public void add(Image image)
    {
        if(image != null)
        {
            if (this.image == null)
            {
                this.image = image;
            } else
            {
                merge(image);
            }
        }

    }

    public Image getImage()
    {
        return image;
    }

    private void merge(Image image)
    {
        BufferedImage bufferedImage1 = SwingFXUtils.fromFXImage(this.image, null);
        BufferedImage bufferedImage2 = SwingFXUtils.fromFXImage(image, null);

        int w = Math.max(bufferedImage1.getWidth(), bufferedImage2.getWidth());
        int h = Math.max(bufferedImage1.getHeight(), bufferedImage2.getHeight());
        BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

        Graphics g = combined.getGraphics();
        g.drawImage(bufferedImage1, 0, 0, null);
        g.drawImage(bufferedImage2, 0, 0, null);

        this.image = SwingFXUtils.toFXImage(combined, null);
    }
}
