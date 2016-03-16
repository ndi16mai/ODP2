package game.pawns.strategy.collison;

import rocket.Rocket;

/**
 * Created by Selma on 2016-03-02.
 */
public class DamageCollision implements CollisionStrategy {
    private int damage;

    public DamageCollision(int damage) {
        this.damage = damage;
    }

    @Override
    public void collide(Rocket rocket) {
        rocket.takeDamage(damage);
    }
}
