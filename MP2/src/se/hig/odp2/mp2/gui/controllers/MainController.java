package se.hig.odp2.mp2.gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import se.hig.odp2.mp2.Main;
import se.hig.odp2.mp2.course.CourseRegister;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{

    private CourseRegister courseRegister;

    public MainController()
    {
       courseRegister = new CourseRegister();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
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
    protected void getCourses() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("gui/layout/CourseView.fxml"));
        Parent parent = (Parent) fxmlLoader.load();

        CourseViewController controller = fxmlLoader.getController();
        controller.setCourseRegister(courseRegister);

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Course view");
        stage.setScene(new Scene(parent));
        stage.show();
    }

    @FXML
    protected void addCourse() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("gui/layout/AddCourseLayout.fxml"));
        Parent parent = (Parent) fxmlLoader.load();

        AddCourseController controller = fxmlLoader.getController();
        controller.setCourseRegister(courseRegister);

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("add Course");
        stage.setScene(new Scene(parent));
        stage.show();
    }

}
