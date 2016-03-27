package game.pawns.strategy.move;

import rocket.util.Vector2;

/**
 * Created by Selma on 2016-03-02.
 */
public class FallingStrategy implements MoveStrategy {
    @Override
    public Vector2 move(Vector2 oldPos) {
        return oldPos.translate(new Vector2(0,1));
    }
}
