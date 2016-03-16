package rocket.components;

import javafx.scene.image.Image;
import rocket.RocketComponent;

/**
 * Created by Selma on 2016-03-03.
 */
public class FuelTank extends RocketComponent {

    public FuelTank(float force, float mass, float handle, int armor, int hull, float fuel)
    {
        super(null, force, mass, handle, armor, hull, fuel);
    }
}
