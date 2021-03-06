package se.hig.odp2.mp2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import se.hig.odp2.mp2.gui.controllers.MainController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("gui/layout/MainLayout.fxml"));

        Parent root = fxmlLoader.load();
        primaryStage.setTitle("MP2");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
