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

	@Override
    public Image getSprite()
    {
        return Assets.wings;
    }

    @Override
    public float getForce()
    {
        return 0;
    }

    @Override
    public float getMass()
    {
        return 5;
    }

    @Override
    public float getHandle()
    {
        return 10;
    }

    @Override
    public int getArmor()
    {
        return 0;
    }

    @Override
    public int getHull()
    {
        return 0;
    }
}
