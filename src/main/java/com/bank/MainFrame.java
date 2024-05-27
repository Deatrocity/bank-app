package com.bank;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainFrame extends Application{

    @Override
    public void start(Stage primaryStage){

        // create stackpane to hold content
        StackPane root = new StackPane();

        // create scene with stack pane as root node
        Scene scene = new Scene(root, 400, 300);

        // Set title of window
        primaryStage.setTitle("Bank Application");

        // set the scene for the stage(window)
        primaryStage.setScene(scene);

        // show the stage
        primaryStage.show();

    }

    public static void main(String args[]){
        launch(args);
    }
    

}
