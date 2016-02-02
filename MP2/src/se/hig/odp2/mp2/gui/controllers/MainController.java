package se.hig.odp2.mp2.gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import se.hig.odp2.mp2.course.CourseRegister;

import java.io.IOException;

public class MainController {

    private Parent addCourseLayout;

    private CourseRegister courseRegister;

    public MainController()
    {
       courseRegister = new CourseRegister();
    }

    @FXML
    protected void createCourseInstance()
    {
        System.out.println("Controller.createCourseInstance");
    }

    @FXML
    protected void editCourseInstance()
    {
        System.out.println("Controller.editCourseInstance");
    }

    @FXML
    protected void registerStudent()
    {
        System.out.println("Controller.registerStudent");
    }

    @FXML
    protected void unregisterStudent()
    {
        System.out.println("Controller.unregisterStudent");
    }

    @FXML
    protected void getCourses()
    {
        System.out.println("Controller.getCourses");
    }

    @FXML
    protected void addCourse() throws IOException
    {

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
//        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("ABC");
        stage.setScene(new Scene(addCourseLayout));
        stage.show();
    }

    public void setAddCourseLayout(Parent addCourseLayout)
    {
        this.addCourseLayout = addCourseLayout;
    }
}
