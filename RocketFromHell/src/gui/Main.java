package gui;

import game.Game;
import game.RocketGame;
import game.control.InputHandler;
import game.control.RocketInput;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//      Parent root = FXMLLoader.load(getClass().getResource("garage/garage.fxml"));
        primaryStage.setTitle("Rocket From Hell");

        Game game = new RocketGame();

        Scene scene = new Scene(game, 800, 600);
        InputHandler inputHandler = new RocketInput(scene);
        game.setInputHandler(inputHandler);

        scene.getStylesheets().add("gui/styles/style.css");

        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        Assets.load();
        launch(args);
    }
}
