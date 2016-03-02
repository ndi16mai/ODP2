package gui.game;

import gui.Assets;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.Bloom;
import rocket.Rocket;
import rocket.components.Engine;
import rocket.components.Hull;
import rocket.components.Wings;
import rocket.construct.RocketBlueprint;
import rocket.construct.RocketBuilder;
import rocket.construct.RocketBuilderVisitor;
import rocket.construct.RocketDirector;
import rocket.util.Vector2;

/**
 * Created by Selma on 2016-03-02.
 */
public class RocketGame extends Game {

    private Rocket rocket;

    public RocketGame() {
        super();
        RocketBlueprint blueprint = new RocketBlueprint(new Hull(), new Wings(), new Engine());

        RocketBuilder rocketBuilder = new RocketBuilder();
        RocketBuilderVisitor visitor = new RocketBuilderVisitor(rocketBuilder);
        RocketDirector rocketDirector = new RocketDirector(visitor, blueprint);
        rocketDirector.build();

        rocket = rocketBuilder.getRocket();

    }

    @Override
    public void render(GraphicsContext gc) {
        gc.drawImage(Assets.hell, 0, 0);
        gc.drawImage(rocket.getSprite(), rocket.getPos().getX() ,rocket.getPos().getY());
    }

    @Override
    public void update() {

        rocket.setPos(new Vector2(rocket.getPos().getX() ,rocket.getPos().getY() +1));
    }
}
