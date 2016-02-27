package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("garage/garage.fxml"));
        primaryStage.setTitle("Rocket to Hell");

        Scene scene = new Scene(root, 300, 300);

        scene.getStylesheets().add("gui/styles/style.css");

        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        Assets.load();
        launch(args);
    }
}
