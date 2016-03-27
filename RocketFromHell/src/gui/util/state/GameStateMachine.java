package gui.util.state;

import game.Game;
import game.RocketGame;
import game.control.InputHandler;
import game.control.RocketInput;
import gui.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import rocket.Rocket;

import java.io.IOException;

/**
 * Created by Wareus on 2016-03-16.
 */
public class GameStateMachine
{
    private static Scene scene;
    public static Rocket rocket;

    public static void setState(State state) throws IOException
    {
        state.updateScene();
    }

    public static void setScene(Scene scene)
    {
        GameStateMachine.scene = scene;
    }

    public enum State {

        SHOP(()->{
            scene.setRoot(FXMLLoader.load(Main.class.getResource("garage/garage.fxml")));
        }),
        GAME(() -> {
            Game game = new RocketGame();

            InputHandler inputHandler = new RocketInput(scene);
            game.setInputHandler(inputHandler);

            scene.setRoot(game);
        });


        private StateProvider provider;

        private State(StateProvider provider) {
            this.provider = provider;
        }


        private interface StateProvider
        {
            void updateScene() throws IOException;
        }

        public void updateScene()
        {
            try
            {
                provider.updateScene();
            } catch (IOException e)
            {
            }
        }
    }

}
