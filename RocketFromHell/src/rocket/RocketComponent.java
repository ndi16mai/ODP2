package rocket;

import javafx.scene.image.Image;

public interface RocketComponent
{
    Image getSprite();
    float getForce();
    float getMass();
    float getHandle();
    int getArmor();
    int getHull();

}
