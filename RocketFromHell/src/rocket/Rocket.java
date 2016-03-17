package rocket;

import game.pawns.Pawn;
import game.pawns.strategy.move.MoveStrategy;
import game.pawns.strategy.move.RocketMoveStrategy;
import javafx.scene.image.Image;
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
//        float angle = (float) Math.toRadians(this.angle);
        Vector2 force = new Vector2(0, -specs.getForce()/100);
        force.rotate(angle);
        System.out.println("force = " + force);
        return force;
    }




}
