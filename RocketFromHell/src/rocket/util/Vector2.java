package rocket.util;

/**
 * Created by Selma on 2016-03-02.
 */
public class Vector2 {
    private float x, y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Vector2 translate(Vector2 moveDelta)
    {
        return new Vector2(x + moveDelta.getX(), y + moveDelta.getY());
    }
}
