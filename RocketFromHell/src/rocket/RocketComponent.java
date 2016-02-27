package rocket;

import javafx.scene.image.Image;
import rocket.construct.RocketBuilderVisitor;

public abstract class RocketComponent
{
    public abstract Image getSprite();
    public abstract float getForce();
    public abstract float getMass();
    public abstract float getHandle();
    public abstract int getArmor();
    public abstract int getHull();

    public void accept(RocketBuilderVisitor visitor)
    {
        visitor.visit(this);
    }

}
