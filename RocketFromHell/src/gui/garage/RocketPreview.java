package gui.garage;

import gui.Assets;
import gui.util.ImageBuilder;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import rocket.Rocket;
import rocket.components.Engine;
import rocket.components.Hull;
import rocket.components.Wings;
import rocket.construct.RocketBlueprint;
import rocket.construct.RocketBuilder;
import rocket.construct.RocketBuilderVisitor;
import rocket.construct.RocketDirector;

public class RocketPreview extends Pane
{
    public RocketPreview()
    {
        RocketBlueprint blueprint = new RocketBlueprint(new Hull(), new Wings(), new Engine());


        RocketBuilder rocketBuilder = new RocketBuilder();
        RocketBuilderVisitor visitor = new RocketBuilderVisitor(rocketBuilder);
        RocketDirector rocketDirector = new RocketDirector(visitor, blueprint);
        rocketDirector.build();

        Rocket rocket = rocketBuilder.getRocket();

        Canvas canvas = new Canvas(250, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();



        gc.drawImage( rocket.getSprite(), 0, 0 );
        this.getChildren().add(canvas);
    }

}
