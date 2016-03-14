package gui.garage;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.Bloom;
import javafx.scene.image.ImageView;
import rocket.Rocket;
import rocket.RocketComponent;
import rocket.factories.EngineFactory;
import rocket.factories.HullFactory;
import rocket.factories.WingsFactory;
import rocket.components.Engine;
import rocket.components.Hull;
import rocket.components.Wings;
import rocket.construct.RocketBlueprint;
import rocket.construct.RocketBuilder;
import rocket.construct.RocketBuilderVisitor;
import rocket.construct.RocketDirector;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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
    @FXML private ImageGridView wings, hulls, engines;


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        RocketBlueprint blueprint = new RocketBlueprint(HullFactory.HULL.get(), WingsFactory.WING.get(), EngineFactory.ENGINE.get());

        RocketBuilder rocketBuilder = new RocketBuilder();
        RocketBuilderVisitor visitor = new RocketBuilderVisitor(rocketBuilder);
        RocketDirector rocketDirector = new RocketDirector(visitor, blueprint);
        rocketDirector.build();

        Rocket rocket = rocketBuilder.getRocket();

        rocketView.setImage(rocket.getSprite());

        rocketView.setEffect(new Bloom());

        specsController.setRocketSpec(rocket.getSpecs());

        RocketComponentSelectHandler handler = new RocketComponentSelectHandler();



        for (WingsFactory wing: Arrays.asList(WingsFactory.values()))
        {
        	RocketComponentView<Wings> componentView = new RocketComponentView(wing.get());
        	componentView.setHandler(handler);
        	wings.add(componentView);
        }
        for (HullFactory hull: Arrays.asList(HullFactory.values()))
        {
        	RocketComponentView<Hull> componentView = new RocketComponentView(hull.get());
        	componentView.setHandler(handler);
        	hulls.add(componentView);
        }
        for (EngineFactory engine: Arrays.asList(EngineFactory.values()))
        {
        	RocketComponentView<Engine> componentView = new RocketComponentView(engine.get());
        	componentView.setHandler(handler);
        	engines.add(componentView);
        }
    }

    @FXML
    public void launchGame()
    {
        System.out.println("hej");
    }
}
