package rocket;

import java.awt.DisplayMode;

import com.sun.javafx.geom.transform.Affine3D;
import com.sun.javafx.geom.transform.BaseTransform;

import game.pawns.Pawn;
import game.pawns.strategy.move.MoveStrategy;
import game.pawns.strategy.move.RocketMoveStrategy;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.transform.Transform;
import rocket.util.Vector2;

/**
 * Created by Wareus on 2016-02-24.
 */
public class Rocket extends Pawn
{
    private RocketSpecs specs = new RocketSpecs();
    private int health;

    public Rocket() {
        super(null, new Vector2(200,300));
        height = 200;
        moveStrategy = new RocketMoveStrategy(this);
        offset = new Vector2(200,200);
    }

    public void draw(GraphicsContext gc)
    {
        gc.save();
        rotate(gc, offset.getX(), offset.getY());
        gc.drawImage(image, offset.getX(), offset.getY(), width, height);
        gc.restore();

        gc.setStroke(Color.GREEN);
        gc.strokeRect(offset.getX(),offset.getY(), width, height);
    }
    
   public void setSprite(Image sprite)
    {
        this.image = sprite;
    }

    public Image getSprite()
    {
        return image;
    }

    public RocketSpecs getSpecs()
    {
        return specs;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage)
    {
        health -= damage;
    }

    public Vector2 getVelocity()
    {
        Vector2 force = new Vector2(0, specs.getForce()/100);
        force = force.rotate(angle);
        return force;
    }
    
    
}
