package rocket;

import javafx.scene.image.Image;

/**
 * Created by Wareus on 2016-02-24.
 */
public class Rocket
{
    private Image sprite;
    private float force, mass, handle;
    private int armor, hull;

    public Rocket(Image sprite)
    {
        this.sprite = sprite;
    }

    public Image getSprite()
    {
        return sprite;
    }

    public void setSprite(Image sprite)
    {
        this.sprite = sprite;
    }

    public float getForce()
    {
        return force;
    }

    public void setForce(float force)
    {
        this.force = force;
    }

    public float getMass()
    {
        return mass;
    }

    public void setMass(float mass)
    {
        this.mass = mass;
    }

    public float getHandle()
    {
        return handle;
    }

    public void setHandle(float handle)
    {
        this.handle = handle;
    }

    public int getArmor()
    {
        return armor;
    }

    public void setArmor(int armor)
    {
        this.armor = armor;
    }

    public int getHull()
    {
        return hull;
    }

    public void setHull(int hull)
    {
        this.hull = hull;
    }
}
