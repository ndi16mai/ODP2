package gui.game;

import gui.Assets;
import gui.game.pawns.Imp;
import gui.game.pawns.Pawn;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.Bloom;
import rocket.Rocket;
import rocket.components.Engine;
import rocket.components.FuelTank;
import rocket.components.Hull;
import rocket.components.Wings;
import rocket.construct.RocketBlueprint;
import rocket.construct.RocketBuilder;
import rocket.construct.RocketBuilderVisitor;
import rocket.construct.RocketDirector;
import rocket.util.Vector2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Selma on 2016-03-02.
 */
public class RocketGame extends Game {

    private Rocket rocket;

    private List<Pawn> pawns = new LinkedList<>();

    public RocketGame() {
        super();
        RocketBlueprint blueprint = new RocketBlueprint(new Hull(), new Wings(), new Engine(), new FuelTank());

        RocketBuilder rocketBuilder = new RocketBuilder();
        RocketBuilderVisitor visitor = new RocketBuilderVisitor(rocketBuilder);
        RocketDirector rocketDirector = new RocketDirector(visitor, blueprint);
        rocketDirector.build();

        rocket = rocketBuilder.getRocket();
        pawns.add(new Imp(new Vector2(200,0)));
    }

    @Override
    public void render(GraphicsContext gc) {
        gc.drawImage(Assets.hell, 0, 0);
        rocket.draw(gc);
        pawns.forEach(pawn -> pawn.draw(gc));
    }

    @Override
    public void update() {

        pawns.forEach(pawn -> {
            pawn.update();
            pawn.isColliding(rocket);
            if(!pawn.isAlive()) {
                pawns.remove(pawn);
            }
        });

    }
}
