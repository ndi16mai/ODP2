package game;

import game.control.InputHandler;
import game.control.RocketInput;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

/**
 * Created by Selma on 2016-03-02.
 */
public abstract class Game extends Pane{

    public abstract void render(GraphicsContext gc);
    public abstract void update();
    protected InputHandler inputHandler;

    public Game() {

        Canvas canvas = new Canvas( 512, 512 );
        this.getChildren().add( canvas );

        GraphicsContext gc = canvas.getGraphicsContext2D();

        final long startNanoTime = System.nanoTime();

        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                update();

                render(gc);

            }
        }.start();
    }

    public void setInputHandler(InputHandler inputHandler)
    {
        this.inputHandler = inputHandler;
    }
}
