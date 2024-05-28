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
        // Set title of window
        primaryStage.setTitle("Bank Application");

        // create stackpane to hold content
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        // create scene with VBox as root node
        Scene mainScene = new Scene(root, 600, 400);

        // Labels
        Label mainLabel = new Label("My Bank Application");

        // Add all nodes to scene
        root.getChildren().addAll(mainLabel, loginFields(), loginButtons(primaryStage, mainScene));

        // Set scene and show stage
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public VBox loginFields(){
        // VBox containing textfields for username and password input
        VBox fields = new VBox();
        fields.setAlignment(Pos.CENTER);
        fields.setMaxWidth(200);
        // username text field
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        // password text field
        TextField passwordField = new TextField();
        passwordField.setPromptText("Password");

        fields.getChildren().addAll(usernameField, passwordField);
        return fields;
    }

    public HBox loginButtons(Stage primaryStage, Scene mainScene){
        // HBox holding two buttons to let user login or register a new account
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(15);

        // login button
        Button loginButton = new Button("Login");
        loginButton.setPrefWidth(120);
        loginButton.setOnAction(e -> {
            primaryStage.setScene(SessionScene.createSessionScene(primaryStage, mainScene));
        });

        // register button
        Button registerButton = new Button("Register");
        registerButton.setPrefWidth(120);

        buttons.getChildren().addAll(loginButton, registerButton);
        return buttons;
    }

    public static void main(String args[]){
        launch(args);
    }
}
