package rocket;

import javafx.scene.image.Image;
import rocket.util.Vector2;

/**
 * Created by Wareus on 2016-02-24.
 */
public class Rocket
{
    private Image sprite;
    private RocketSpecs specs = new RocketSpecs();
    private Vector2 pos = new Vector2(0,0);

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

    public Vector2 getPos() {
        return pos;
    }

    public void setPos(Vector2 pos) {
        this.pos = pos;
    }
}
