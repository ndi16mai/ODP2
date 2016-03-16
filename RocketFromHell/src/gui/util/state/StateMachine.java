package gui.util.state;

import javafx.scene.Scene;

/**
 * Created by Wareus on 2016-03-16.
 */
public class StateMachine
{
    private Scene scene;

    public StateMachine(Scene scene)
    {
        this.scene = scene;
    }

    public void setState(State state)
    {
        state.updateScene(scene);
    }
}
