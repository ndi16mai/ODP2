package rocket.components;

import gui.Assets;
import javafx.scene.image.Image;
import rocket.RocketComponent;

/**
 * Created by Wareus on 2016-02-26.
 */
public class Wings extends RocketComponent
{
    public Wings(Image sprite, float force, float mass, float handle, int armor, int hull) {
		super(sprite, force, mass, handle, armor, hull);
	}
}
