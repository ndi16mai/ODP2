package game.pawns;

import game.pawns.strategy.collison.CollisionStrategy;
import game.pawns.strategy.move.MoveStrategy;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import rocket.Rocket;
import rocket.util.Vector2;

/**
 * Created by Selma on 2016-03-02.
 */
public abstract class Pawn {

    protected Image image;
    protected Vector2 pos, offset = new Vector2(0,0);
    protected MoveStrategy moveStrategy;
    protected int width = 100, height = 100;
    protected boolean alive = true;
    protected CollisionStrategy collisionStrategy;
    protected float angle;

    public Pawn(Image image, Vector2 pos) {
        this.image = image;
        this.pos = pos;
    }

    public void draw(GraphicsContext gc, Vector2 translate)
    {
        gc.save();
        rotate(gc, pos.getX(), pos.getY());
        gc.drawImage(image, pos.getX() + translate.getX(), pos.getY() + translate.getY(), width, height);
        gc.restore();

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

    public void isColliding(Rocket rocket)
    {
        if (collisionStrategy != null) {
            Rectangle rectangle = new Rectangle(pos.getX(), pos.getY(), width, height);
            Rectangle rocketRectangle = new Rectangle(rocket.pos.getX() + rocket.offset.getX(), rocket.pos.getY() - rocket.offset.getY() - 100, rocket.width, rocket.height);

            if (rectangle.intersects(rocketRectangle.getLayoutBounds())) {
                collisionStrategy.collide(rocket);
                destroy();
            }
        }
    }

    public void rotated(float angle)
    {
        this.angle += angle;
    }

    protected void rotate(GraphicsContext gc, float x, float y) {
        float px = (float) (x + image.getWidth()/2);
        float py = (float) (y + image.getHeight()/2);
        Rotate rotate = new Rotate(angle, px, py);
        gc.setTransform(rotate.getMxx(), rotate.getMyx(), rotate.getMxy(), rotate.getMyy(), rotate.getTx(), rotate.getTy());
    }

	public Vector2 getPos() {
		return pos;
	}
    
    
}
