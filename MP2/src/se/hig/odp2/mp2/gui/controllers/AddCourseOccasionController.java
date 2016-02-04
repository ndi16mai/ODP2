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
import se.hig.odp2.mp2.course.CourseOccasion;
import se.hig.odp2.mp2.course.Period;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by Selma on 2016-02-04.
 */
public class AddCourseOccasionController{
    @FXML
    private TextField year, speed, period;

    @FXML
    private ChoiceBox<Course> courseList;

    public void setCourseRegister(ObservableList<Course> courseRegister) {
        courseList.setItems(courseRegister);
        courseList.getSelectionModel().selectFirst();
    }

    @FXML
    protected void addCourseOccasion(ActionEvent event)
    {
        Course course = courseList.getSelectionModel().getSelectedItem();
        int year = Integer.parseInt(this.year.getText());
        int period = Integer.parseInt(this.period.getText());
        int speed = Integer.parseInt(this.speed.getText());
        course.addCourseOccasion(new CourseOccasion(course, new Period(year, period), speed));

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }
}
