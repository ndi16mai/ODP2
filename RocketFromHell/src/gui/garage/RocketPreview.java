package gui.garage;

import gui.Assets;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RocketPreview extends Pane
{
    public RocketPreview()
    {
        Canvas canvas = new Canvas(250, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Image rocket = Assets.rocket;

        gc.drawImage( rocket, 50, 50 );
        this.getChildren().add(canvas);
    }

}
