package rocket;

import javafx.scene.image.Image;

/**
 * Created by Wareus on 2016-02-24.
 */
public class Rocket
{
    private Image sprite;
    private RocketSpecs specs = new RocketSpecs();

    public void setSprite(Image sprite)
    {
        this.sprite = sprite;
    }

    public Image getSprite()
    {
        return sprite;
    }

    public RocketSpecs getSpecs()
    {
        return specs;
    }
}
