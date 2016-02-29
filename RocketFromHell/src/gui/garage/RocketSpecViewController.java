package gui.garage;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import rocket.RocketSpecs;

/**
 * Created by Wareus on 2016-02-28.
 */
public class RocketSpecViewController
{
    @FXML private Text hull, mass, armor, force, handle;


    public void setRocketSpec(RocketSpecs specs)
    {
        mass.setText((int)specs.getMass() + "");
        force.setText((int)specs.getForce() + "");
        handle.setText((int)specs.getHandle() + "");
        hull.setText(specs.getHull() + "");
        armor.setText(specs.getArmor() + "");
    }
}
