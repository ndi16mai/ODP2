package gui;

import gui.game.RocketGame;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("garage/garage.fxml"));
        primaryStage.setTitle("Rocket From Hell");

        Pane root = new RocketGame();

        Scene scene = new Scene(root, 800, 600);

        scene.getStylesheets().add("gui/styles/style.css");

        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        Assets.load();
        launch(args);
    }
}
