package se.hig.odp2.mp2.gui.controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import se.hig.odp2.mp2.course.Course;

import java.net.URL;
import java.util.ResourceBundle;

public class AddCourseController implements Initializable
{
    @FXML
    private TextField name, code;
    @FXML
    private ChoiceBox<Float> points;

    private ObservableList<Course> courseRegister;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        points.getSelectionModel().selectFirst();
    }

    @FXML
    protected void addCourse(ActionEvent event)
    {
        courseRegister.add(new Course(name.getText(), code.getText(), points.getValue()));

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }

    public void setCourseRegister(ObservableList<Course> courseRegister)
    {
        this.courseRegister = courseRegister;
    }
}
