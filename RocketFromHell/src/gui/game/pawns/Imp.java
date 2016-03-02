package gui.game.pawns;

import gui.Assets;
import gui.game.pawns.strategy.collison.DamageCollision;
import gui.game.pawns.strategy.move.FallingStrategy;
import rocket.util.Vector2;

/**
 * Created by Selma on 2016-03-02.
 */
public class Imp extends Pawn {


    public Imp(Vector2 pos) {
        super(Assets.imp, pos);
        moveStrategy = new FallingStrategy();
        collisionStrategy = new DamageCollision(5);
    }

}
