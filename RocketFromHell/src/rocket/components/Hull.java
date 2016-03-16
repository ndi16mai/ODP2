package rocket.components;

import gui.Assets;
import javafx.scene.image.Image;
import rocket.RocketComponent;

/**
 * Created by Wareus on 2016-02-27.
 */
public class Hull extends RocketComponent
{
    public Hull(Image sprite, float force, float mass, float handle, int armor, int hull, float fuel)
    {
        super(sprite, force, mass, handle, armor, hull, fuel);
    }
}
