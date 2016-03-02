package gui.game.pawns;

import gui.game.pawns.strategy.collison.CollisionStrategy;
import gui.game.pawns.strategy.move.MoveStrategy;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import rocket.util.Vector2;

/**
 * Created by Selma on 2016-03-02.
 */
public abstract class Pawn {

    protected Image image;
    protected Vector2 pos;
    protected MoveStrategy moveStrategy;
    protected int width = 100, height = 100;
    protected boolean alive = true;
    protected CollisionStrategy collisionStrategy;

    public Pawn(Image image, Vector2 pos) {
        this.image = image;
        this.pos = pos;
    }

    public void draw(GraphicsContext gc)
    {
        gc.drawImage(image, pos.getX(), pos.getY(), width, height);
    }

    public void update()
    {
        if(moveStrategy != null)
        {
            pos = moveStrategy.move(pos);
        }
    }

    public void destroy(){
        alive = false;
    }

    public boolean isAlive(){
       return alive;
    }
}
