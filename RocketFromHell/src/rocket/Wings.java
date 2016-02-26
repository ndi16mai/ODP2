package rocket;

import javafx.scene.image.Image;

/**
 * Created by Wareus on 2016-02-26.
 */
public class Wings implements RocketComponent
{
    @Override
    public Image getSprite()
    {
        return null;
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
