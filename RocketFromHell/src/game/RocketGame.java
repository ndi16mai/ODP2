package game;

import game.control.InputHandler;
import game.levels.Camera;
import gui.Assets;
import game.pawns.Imp;
import game.pawns.Pawn;
import javafx.scene.canvas.GraphicsContext;
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
    private Camera camera;

    public RocketGame() {
        super();
        RocketBlueprint blueprint = new RocketBlueprint(new Hull(), new Wings(), new Engine(), new FuelTank());

        RocketBuilder rocketBuilder = new RocketBuilder();
        RocketBuilderVisitor visitor = new RocketBuilderVisitor(rocketBuilder);
        RocketDirector rocketDirector = new RocketDirector(visitor, blueprint);
        rocketDirector.build();

        rocket = rocketBuilder.getRocket();
        pawns.add(new Imp(new Vector2(200,0)));

        this.camera = new Camera(0,0);
    }

    @Override
    public void render(GraphicsContext gc) {
        gc.translate(camera.getX(), camera.getY());
        gc.drawImage(Assets.hell, 0, 0);
        rocket.draw(gc);
        pawns.forEach(pawn -> pawn.draw(gc));
        gc.translate(-camera.getX(), -camera.getY());
    }

    @Override
    public void update() {
        camera.tick();
        if(inputHandler.isPressed("LEFT"))
        {
            rocket.rotated(-1);
        }
        if(inputHandler.isPressed("RIGHT"))
        {
            rocket.rotated(1);
        }
        pawns.forEach(pawn -> {
            pawn.update();
            pawn.isColliding(rocket);
            if(!pawn.isAlive()) {
                pawns.remove(pawn);
            }
        });

    }
}
