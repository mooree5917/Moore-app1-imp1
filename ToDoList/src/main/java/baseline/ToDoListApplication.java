/*
UCF COP3330 Summer 2021 Application Assignment 1 part 2 Solution
Copyright 2021 Eric Moore
 */
package baseline;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ToDoListApplication extends Application {
    //might need a method or short section of code to ask the user if they would like to load a list.
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ToDoListApplication.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("To Do List Application");
        /*
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setTitle("JavaFX and Gradle");
        */
        stage.setScene(scene);

        stage.show();
    }

    void ToDoTitle(){
        //To have a user enter the name of their list or use in the main class.
    }

    public int ToDoListCounter() {
        //This is a method used to store the number of unique items entered by the user up to a value of 256.
        return 0;
    }

    void ToDoDescription(){
        //Request the user to enter what the item is or its description.
    }

    void ToDoGoal(){
        //request the user to complete their list by a date in the form of YYYY/MM/DD
    }

    void EditToDo(){
        //To add, remove a new list, or change the title.
    }

    void ToDoDisplay(){
        //To display the user's list of item that are complete, incomplete, or existing.
    }

    void ToDoSave(){
        //To save the user's list locally.
    }



    public static void main(String[] args) {
        launch(args);
    }
}
