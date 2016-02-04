package se.hig.odp2.mp2.gui.controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import se.hig.odp2.mp2.course.Course;
import se.hig.odp2.mp2.course.CourseOccasion;

public class CourseViewController
{
    private ObservableList<Course> courseRegister;

    @FXML
    private ListView<Course> courseList;
    @FXML
    private ListView<CourseOccasion> courseOccasionList;

    public void setCourseRegister(ObservableList<Course> courseRegister)
    {

        this.courseRegister = courseRegister;
        courseList.setItems(courseRegister);

        courseList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                Course course = (Course) newValue;
                ObservableList<CourseOccasion> courseOccasions = FXCollections.observableArrayList(course.getCourseOccasions());
                courseOccasionList.setItems(courseOccasions);
            }
        });
    }
}
