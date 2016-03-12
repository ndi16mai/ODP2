package gui.util.shop;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import rocket.RocketComponent;

/**
 * Created by Wareus on 2016-03-03.
 */
public class RocketComponentView extends ImageView
{
	private RocketComponentSelectHandler handler;
    private int imageSize = 50;
    private RocketComponent component;

    public RocketComponentView(RocketComponent component)
    {
        super(component.getSprite());

        setFitHeight(imageSize);
        setFitWidth(imageSize);
        this.component = component;


        setOnMouseClicked(event -> {
        	if(handler != null)
            	handler.select(this);
        });
    }
    
    public void select()
    {
    	setEffect( new DropShadow( 30, Color.DARKRED ) );
    	System.out.println("selecet");
    }
    
    public void deselect()
    {
    	setEffect(null);
    }

	public void setHandler(RocketComponentSelectHandler handler) {
		this.handler = handler;
	}
    
    



}
