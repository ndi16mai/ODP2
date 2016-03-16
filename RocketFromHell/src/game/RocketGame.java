package game;

import static gui.util.state.GameStateMachine.*;
import game.levels.Camera;
import gui.Assets;
import game.pawns.Imp;
import game.pawns.Pawn;
import javafx.scene.canvas.GraphicsContext;
import rocket.util.Vector2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Selma on 2016-03-02.
 */
public class RocketGame extends Game {

    private List<Pawn> pawns = new LinkedList<>();
    private Camera camera;

    public RocketGame() {
        super();
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
