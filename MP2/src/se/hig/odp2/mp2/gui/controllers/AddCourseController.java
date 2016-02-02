package se.hig.odp2.mp2.gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddCourseController
{
    @FXML
    private TextField name, code;
    @FXML
    private ChoiceBox<Float> points;

    @FXML
    protected void addCourse(ActionEvent event)
    {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }

}
