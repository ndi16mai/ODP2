package gui.garage;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import rocket.RocketSpecs;

/**
 * Created by Wareus on 2016-02-28.
 */
public class RocketSpecViewController
{
    @FXML private Text hull;


    public void setRocketSpec(RocketSpecs specs)
    {
        hull.setText(specs.getHull() + "");
    }
}
