package gui.garage;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.Blend;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import rocket.Rocket;
import rocket.RocketComponent;
import rocket.components.Engine;
import rocket.components.Hull;
import rocket.components.Wings;
import rocket.construct.RocketBlueprint;
import rocket.construct.RocketBuilder;
import rocket.construct.RocketBuilderVisitor;
import rocket.construct.RocketDirector;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import gui.util.shop.ImageGridView;
import gui.util.shop.RocketComponentSelectHandler;
import gui.util.shop.RocketComponentView;

/**
 * Created by Wareus on 2016-02-24.
 */
public class GarageController implements Initializable
{
    @FXML private ImageView rocketView;
    @FXML private RocketSpecViewController specsController;
    @FXML private ImageGridView gridView;


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        RocketBlueprint blueprint = new RocketBlueprint(new Hull(), new Wings(), new Engine());

        RocketBuilder rocketBuilder = new RocketBuilder();
        RocketBuilderVisitor visitor = new RocketBuilderVisitor(rocketBuilder);
        RocketDirector rocketDirector = new RocketDirector(visitor, blueprint);
        rocketDirector.build();

        Rocket rocket = rocketBuilder.getRocket();

        rocketView.setImage(rocket.getSprite());

        rocketView.setEffect(new Bloom());

        specsController.setRocketSpec(rocket.getSpecs());

        RocketComponentSelectHandler handler = new RocketComponentSelectHandler();
        ArrayList<RocketComponent> components = new ArrayList<>();
        components.add(new Hull());
        components.add(new Wings());
        components.add(new Engine());
        

        for (RocketComponent component: components)
        {
        	RocketComponentView componentView = new RocketComponentView(component);
        	componentView.setHandler(handler);
        	gridView.add(componentView);
        	
        }
    }

    @FXML
    public void launchGame()
    {
        System.out.println("hej");
    }
}
