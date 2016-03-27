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
public class RocketComponentView <T extends RocketComponent> extends ImageView
{
	private RocketComponentSelectHandler<T> handler;
    private int imageSize = 50;
    private T component;

    public RocketComponentView(T component)
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
    }
    
    public void deselect()
    {
    	setEffect(null);
    }

	public void setHandler(RocketComponentSelectHandler handler) {
		this.handler = handler;
	}

	public T getComponent() {
		return component;
	}
	
	
    
    



}
