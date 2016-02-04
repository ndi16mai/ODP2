package se.hig.odp2.mp2.gui.controllers;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import se.hig.odp2.mp2.course.CourseCommitment;
import se.hig.odp2.mp2.course.CourseOccasion;
import se.hig.odp2.mp2.model.Person;
import se.hig.odp2.mp2.model.Role;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;


public class CommitPersonController implements Initializable
{
    @FXML
    private ChoiceBox<Role> role;
    @FXML
    private TextField firstname, lastname;

    private CourseOccasion courseOccasion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List<Role> roleList = Arrays.asList(Role.values());
        role.setItems(FXCollections.observableList(roleList));
    }

    public void setCourseOccasion(CourseOccasion courseOccasion) {
        this.courseOccasion = courseOccasion;
    }

    public void commitPerson(ActionEvent event)
    {
        Person person = new Person(firstname.getText(), lastname.getText());
        CourseCommitment courseCommitment = new CourseCommitment(person, role.getValue());

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }
}
