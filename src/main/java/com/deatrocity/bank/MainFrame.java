package com.deatrocity.bank;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * MainFrame class that extends the JavaFX Application class.
 * This class sets up the primary stage for the bank application.
 */
public class MainFrame extends Application{

    private Scene mainScene;
    private HBox usernameHBox, passwordHBox, topButtons;
    private VBox rootLayout;
    private Label mainLabel, usernameLabel, passwordLabel;
    private TextField usernameField;
    private PasswordField passwordField;
    private Button loginButton, clearButton, registerButton;

    @Override
    public void start(Stage primaryStage){
        // Set title of window
        primaryStage.setTitle("Bank Application");

         // Create the root layout and set its properties
        rootLayout = new VBox();
        rootLayout.setAlignment(Pos.TOP_CENTER);
        rootLayout.setPadding(new Insets(20));

        // Create a scene with VBox as the root node
        mainScene = new Scene(rootLayout, 750, 620);

        // Create and style main label
        mainLabel = new Label("Deatrick Peoples Bank");
        mainLabel.setFont(new Font("Arial", 30));
        mainLabel.setPadding(new Insets(0, 0, 200, 0));

        // Create register button
        registerButton = new Button("Register");
        registerButton.setPrefWidth(120);
        registerButton.setOnAction(e -> {System.out.println(">>Register!<<");}); // WIP

        // Add all nodes to the scene
        rootLayout.getChildren().addAll(mainLabel, createUsernameNodes(), createPasswordNodes(), createTopButtons(primaryStage), registerButton);

        // Set the Scene and show the stage
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    /**
     * Creates the HBox containing username label and text field.
     * @return HBox with username nodes.
     */
    public HBox createUsernameNodes(){
        usernameHBox = new HBox();
        usernameHBox.setAlignment(Pos.CENTER);
        usernameHBox.setPadding(new Insets(0, 0, 15, 0));

        usernameLabel = new Label("Username");
        usernameLabel.setPadding(new Insets(0, 10, 0 , 0));
        usernameLabel.setFont(new Font("Arial", 20));

        usernameField = new TextField();
        usernameField.setPromptText("Username");
        usernameField.setPrefWidth(200);

        usernameHBox.getChildren().addAll(usernameLabel, usernameField);
        return usernameHBox;
    }

    /**
     * Creates the HBox containing password label and text field.
     * @return HBox with password nodes.
     */
    public HBox createPasswordNodes(){
        passwordHBox = new HBox();
        passwordHBox.setAlignment(Pos.CENTER);
        passwordHBox.setPadding(new Insets(0, 0, 30, 0));

        passwordLabel = new Label("Password");
        passwordLabel.setPadding(new Insets(0, 10, 0 , 0));
        passwordLabel.setFont(new Font("Arial", 20));

        passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setPrefWidth(200);

        passwordHBox.getChildren().addAll(passwordLabel, passwordField);

        return passwordHBox;
    }

    /**
     * Creates the HBox containing login and register buttons.
     * @param primaryStage The primary stage of the application.
     * @param mainScene The main scene of the application.
     * @return HBox with login buttons.
     */
    public HBox createTopButtons(Stage primaryStage){
        topButtons = new HBox();
        topButtons.setAlignment(Pos.CENTER);
        topButtons.setSpacing(15);
        topButtons.setPadding(new Insets(0, 0, 10, 0));

        loginButton = new Button("Login");
        loginButton.setPrefWidth(120);
        loginButton.setOnAction(e -> {
            SessionScene sessionScene = new SessionScene(primaryStage, mainScene);
            primaryStage.setScene(sessionScene.createSessionScene());
        });

        clearButton = new Button("Clear");
        clearButton.setPrefWidth(120);
        clearButton.setOnAction(e -> {
            passwordField.clear();
            usernameField.clear();
        });
        
        topButtons.getChildren().addAll(loginButton, clearButton);
        return topButtons;
    }

    /**
     * The main method to launch the JavaFX application.
     * @param args Command line arguments.
     */
    public static void main(String args[]){
        launch(args);
    }
}
