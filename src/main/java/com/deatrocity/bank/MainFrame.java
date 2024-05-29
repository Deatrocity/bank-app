package com.deatrocity.bank;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainFrame extends Application{

    

    @Override
    public void start(Stage primaryStage){
        // Set title of window
        primaryStage.setTitle("Bank Application");

        VBox rootLayout = new VBox();
        rootLayout.setAlignment(Pos.TOP_CENTER);
        rootLayout.setPadding(new Insets(20));

        // create scene with VBox as root node
        Scene mainScene = new Scene(rootLayout, 700, 600);

        // Labels
        Label mainLabel = new Label("Deatrick Peoples Bank");
        mainLabel.setFont(new Font("Arial", 30));
        mainLabel.setPadding(new Insets(0, 0, 200, 0));

        // Add all nodes to scene
        rootLayout.getChildren().addAll(mainLabel, usernameNodes(), passwordNodes(), loginButtons(primaryStage, mainScene));

        // Set scene and show stage
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static HBox usernameNodes(){
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(0, 0, 15, 0));

        Label usernameLabel = new Label("Username");
        usernameLabel.setPadding(new Insets(0, 10, 0 , 0));
        usernameLabel.setFont(new Font("Arial", 20));

        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        usernameField.setPrefWidth(200);

        hbox.getChildren().addAll(usernameLabel, usernameField);

        return hbox;
    }

    public HBox passwordNodes(){
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(0, 0, 30, 0));
        

        Label passwordLabel = new Label("Password");
        passwordLabel.setPadding(new Insets(0, 10, 0 , 0));
        passwordLabel.setFont(new Font("Arial", 20));

        TextField passwordField = new TextField();
        passwordField.setPromptText("Password");
        passwordField.setPrefWidth(200);

        hbox.getChildren().addAll(passwordLabel, passwordField);

        return hbox;
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
