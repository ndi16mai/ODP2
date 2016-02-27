package rocket.construct;

import gui.util.ImageBuilder;
import rocket.Rocket;
import rocket.RocketComponent;
import rocket.RocketSpecs;

/**
 * Created by Wareus on 2016-02-27.
 */
public class RocketBuilder
{
    private Rocket rocket = new Rocket();
    private ImageBuilder imageBuilder = new ImageBuilder();

    public void addComponent(RocketComponent rocketComponent)
    {
        imageBuilder.add(rocketComponent.getSprite());
        rocket.setSprite(imageBuilder.getImage());

        RocketSpecs specs = rocket.getSpecs();
        specs.addComponent(rocketComponent);
    }

    public Rocket getRocket()
    {
        return rocket;
    }
}
