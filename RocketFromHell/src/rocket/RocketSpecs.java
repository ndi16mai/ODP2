package rocket;

import javafx.scene.image.Image;

/**
 * Created by Wareus on 2016-02-27.
 */
public class RocketSpecs
{
    private float force, mass, handle;
    private int armor, hull, fuel;

    public void addComponent(RocketComponent rocketComponent)
    {
        force += rocketComponent.getForce();
        mass +=  rocketComponent.getMass();
        handle += rocketComponent.getHandle();
        armor += rocketComponent.getArmor();
        hull += rocketComponent.getHull();
        fuel += rocketComponent.getFuel();
    }

    public float getForce()
    {
        return force;
    }

    public float getMass()
    {
        return mass;
    }

    public float getHandle()
    {
        return handle;
    }

    public int getArmor()
    {
        return armor;
    }

    public int getHull()
    {
        return hull;
    }

    public int getFuel(){
        return fuel;
    }
}
