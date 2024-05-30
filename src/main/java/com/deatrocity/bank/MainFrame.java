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

/**
 * MainFrame class that extends the JavaFX Application class.
 * This class sets up the primary stage for the bank application.
 */
public class MainFrame extends Application{
    @Override
    public void start(Stage primaryStage){
        // Set title of window
        primaryStage.setTitle("Bank Application");

         // Create the root layout and set its properties
        VBox rootLayout = new VBox();
        rootLayout.setAlignment(Pos.TOP_CENTER);
        rootLayout.setPadding(new Insets(20));

        // Create a scene with VBox as the root node
        Scene mainScene = new Scene(rootLayout, 700, 620);

        // Create and style main label
        Label mainLabel = new Label("Deatrick Peoples Bank");
        mainLabel.setFont(new Font("Arial", 30));
        mainLabel.setPadding(new Insets(0, 0, 200, 0));

        // Add all nodes to the scene
        rootLayout.getChildren().addAll(mainLabel, usernameNodes(), passwordNodes(), loginButtons(primaryStage, mainScene));

        // Set the Scene and show the stage
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    /**
     * Creates the HBox containing username label and text field.
     * @return HBox with username nodes.
     */
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

    /**
     * Creates the HBox containing password label and text field.
     * @return HBox with password nodes.
     */
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

    /**
     * Creates the VBox containing text fields for username and password input.
     * @return VBox with login fields.
     */
    public VBox loginFields(){
        VBox fields = new VBox();
        fields.setAlignment(Pos.CENTER);
        fields.setMaxWidth(200);

        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");

        TextField passwordField = new TextField();
        passwordField.setPromptText("Password");

        fields.getChildren().addAll(usernameField, passwordField);
        return fields;
    }


    /**
     * Creates the HBox containing login and register buttons.
     * @param primaryStage The primary stage of the application.
     * @param mainScene The main scene of the application.
     * @return HBox with login buttons.
     */
    public HBox loginButtons(Stage primaryStage, Scene mainScene){
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(15);

        Button loginButton = new Button("Login");
        loginButton.setPrefWidth(120);
        loginButton.setOnAction(e -> {
            primaryStage.setScene(SessionScene.createSessionScene(primaryStage, mainScene));
        });

        Button registerButton = new Button("Register");
        registerButton.setPrefWidth(120);

        buttons.getChildren().addAll(loginButton, registerButton);
        return buttons;
    }

    /**
     * The main method to launch the JavaFX application.
     * @param args Command line arguments.
     */
    public static void main(String args[]){
        launch(args);
    }
}
