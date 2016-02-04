package se.hig.odp2.mp2.gui.controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import se.hig.odp2.mp2.Main;
import se.hig.odp2.mp2.course.Course;
import se.hig.odp2.mp2.course.CourseCommitment;
import se.hig.odp2.mp2.course.CourseOccasion;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CourseViewController
{
    private ObservableList<Course> courseRegister;

    @FXML
    private ListView<Course> courseList;
    @FXML
    private ListView<CourseOccasion> courseOccasionList;
    @FXML
    private ListView<CourseCommitment> commitmentList;

    @FXML
    protected void addPerson() throws IOException
    {
        CourseOccasion courseOccasion = courseOccasionList.getSelectionModel().getSelectedItem();

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("gui/layout/CommitPersonLayout.fxml"));
        Parent parent = (Parent) fxmlLoader.load();

        CommitPersonController controller = fxmlLoader.getController();
        controller.setCourseOccasion(courseOccasion);

        ObservableList<CourseCommitment> courseCommitments commitmentList.getItems();

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Commit person");
        stage.setScene(new Scene(parent));
        stage.show();

    }

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
