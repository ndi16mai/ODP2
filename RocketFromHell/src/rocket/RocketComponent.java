package rocket;

import javafx.scene.image.Image;
import rocket.construct.RocketBuilderVisitor;

public abstract class RocketComponent
{
	protected Image sprite;
	protected float force, mass, handle, fuel;
	protected int armor, hull;
	
    

    public RocketComponent(Image sprite, float force, float mass, float handle, int armor, int hull, float fuel) {
		super();
		this.sprite = sprite;
		this.force = force;
		this.mass = mass;
		this.handle = handle;
		this.armor = armor;
		this.hull = hull;
		this.fuel = fuel;
	}



	public Image getSprite() {
		return sprite;
	}



	public float getForce() {
		return force;
	}



	public float getMass() {
		return mass;
	}



	public float getHandle() {
		return handle;
	}



	public int getArmor() {
		return armor;
	}



	public int getHull() {
		return hull;
	}

	public float getFuel()
	{
		return fuel;
	}

	public void accept(RocketBuilderVisitor visitor)
    {
        visitor.visit(this);
    }

}
