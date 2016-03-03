package gui.util;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import rocket.RocketComponent;

/**
 * Created by Wareus on 2016-03-03.
 */
public class RocketComponentView extends ImageView
{
    private int imageSize = 50;
    private RocketComponent component;

    public RocketComponentView(RocketComponent component)
    {
        super(component.getSprite());

        setFitHeight(imageSize);
        setFitWidth(imageSize);
        this.component = component;

        setOnMouseClicked(event -> {
            System.out.println("click");
        });
    }



}
