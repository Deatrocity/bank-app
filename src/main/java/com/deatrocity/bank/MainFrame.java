package com.deatrocity.bank;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainFrame extends Application{

    @Override
    public void start(Stage primaryStage){

        // create stackpane to hold content
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        // create scene with stack pane as root node
        Scene scene = new Scene(root, 400, 300);

        // Labels
        Label mainLabel = new Label("My Bank Application");

        // Add label to the root stack pane
        root.getChildren().addAll(mainLabel, loginFields() ,loginButtons());

        // Set title of window
        primaryStage.setTitle("Bank Application");

        // set the scene for the stage(window)
        primaryStage.setScene(scene);

        // show the stage
        primaryStage.show();

    }

    public VBox loginFields(){
        // Vertical container for text fields to control width
        VBox fields = new VBox();
        fields.setAlignment(Pos.CENTER);
        fields.setMaxWidth(200);

        // Text fields
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");

        TextField passwordField = new TextField();
        passwordField.setPromptText("Password");

        fields.getChildren().addAll(usernameField, passwordField);
        
        return fields;
    }

    public HBox loginButtons(){
        // displays buttons horizontally
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);

        // Buttons
        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");
        buttons.getChildren().addAll(loginButton, registerButton);
        return buttons;
    }

    public static void main(String args[]){
        launch(args);
    }
}
