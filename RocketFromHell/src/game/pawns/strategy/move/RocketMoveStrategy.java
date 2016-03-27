package game.pawns.strategy.move;

import rocket.Rocket;
import rocket.util.Vector2;

/**
 * Created by Selma on 2016-03-17.
 */
public class RocketMoveStrategy implements MoveStrategy {
    private Rocket rocket;

    public RocketMoveStrategy(Rocket rocket) {
        this.rocket = rocket;
    }

    @Override
    public Vector2 move(Vector2 oldPos) {
        return oldPos.translate(rocket.getVelocity());
    }
}
