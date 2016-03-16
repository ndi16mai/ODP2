package game.control;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Selma on 2016-03-09.
 */
public class RocketInput implements InputHandler {
    List<String> input;
    Scene scene;

    public RocketInput(Scene scene)
    {
        this.input = new ArrayList<>();
        this.scene = scene;
        setInput();
    }

    private void setInput()
    {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                String code = event.getCode().toString();
                if(!input.contains(code))
                {
                    input.add(code);
                }
            }
        });

        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                String code = event.getCode().toString();
                input.remove(code);
            }
        });
    }

    public boolean isPressed(String string)
    {
        return input.contains(string);
    }

}
