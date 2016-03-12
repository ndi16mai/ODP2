package game.levels;

import game.pawns.Pawn;

/**
 * Created by Selma on 2016-03-12.
 */
public class Camera {
    private float x, y;

    public Camera(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void tick()
    {
        ++y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

}
