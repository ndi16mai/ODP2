package se.hig.odp2.mp2.gui.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import se.hig.odp2.mp2.course.Course;
import se.hig.odp2.mp2.course.CourseRegister;

public class CourseViewController
{
    private CourseRegister courseRegister;

    @FXML
    private ListView courseList;

    public void setCourseRegister(CourseRegister courseRegister)
    {

        this.courseRegister = courseRegister;

        ObservableList<Course> items = FXCollections.observableArrayList (new Course("name", "code", 7.5f));
        courseList.setItems(items);
    }
}
