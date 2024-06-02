package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RegisterScene {
    
    private Stage primaryStage;
    private Scene registerScene, mainScene;
    private Label mainLabel, registerLabel, usernameLabel, passwordLabel, confirmLabel, 
        emailLabel, firstNameLabel, lastNameLabel;
    private VBox rootLayout, inputLabels, inputFields;
    private HBox navigationButtons, registerBox;
    private TextField usernameField,emailField, firstNameField, 
        lastNameField;
    private PasswordField passwordField, confirmField;
    private Button registerButton, backButton;

    RegisterScene(Stage primaryStage, Scene mainScene){
        this.primaryStage = primaryStage;
        this.mainScene = mainScene;
    }

    public Scene createRegisterScene() {
        registerScene = new Scene(createRootLayout(), 750, 620);
        return registerScene;
    }

    public VBox createRootLayout(){
        rootLayout = new VBox();
        rootLayout.setAlignment(Pos.TOP_CENTER);
        rootLayout.setPadding(new Insets(20));

        mainLabel = new Label("Deatrick Peoples Bank");
        mainLabel.setPadding(new Insets(0, 0, 10 , 0));
        mainLabel.setFont(new Font("Arial", 30));

        registerLabel = new Label("Register New Account");
        registerLabel.setPadding(new Insets(0, 0, 10 , 0));
        registerLabel.setFont(new Font("Arial", 16));

        rootLayout.getChildren().addAll(mainLabel, registerLabel, createRegisterBox(), 
            createNavigationButtons());
        return rootLayout;
    }

    public HBox createRegisterBox(){
        registerBox = new HBox();
        registerBox.setAlignment(Pos.TOP_CENTER);
        registerBox.setSpacing(15);

        inputLabels = new VBox();
        inputLabels.setAlignment(Pos.CENTER_RIGHT);
        inputLabels.setSpacing(22);
        usernameLabel = new Label("Username");
        usernameLabel.setFont(new Font("Arial", 15));
        passwordLabel = new Label("Password");
        passwordLabel.setFont(new Font("Arial", 15));
        confirmLabel = new Label("Confirm Password");
        confirmLabel.setFont(new Font("Arial", 15));
        firstNameLabel = new Label("First Name");
        firstNameLabel.setFont(new Font("Arial", 15));
        lastNameLabel = new Label("Last Name");
        lastNameLabel.setFont(new Font("Arial", 15));
        emailLabel = new Label("Email Address");
        emailLabel.setFont(new Font("Arial", 15));
        inputLabels.getChildren().addAll(usernameLabel, passwordLabel, confirmLabel, 
        firstNameLabel, lastNameLabel, emailLabel);

        inputFields = new VBox();
        inputFields.setPrefWidth(250);
        inputFields.setSpacing(10);
        usernameField = new TextField();
        usernameField.setFont(new Font("Arial", 16));
        passwordField = new PasswordField();
        passwordField.setFont(new Font("Arial", 16));
        confirmField = new PasswordField();
        confirmField.setFont(new Font("Arial", 16));
        firstNameField = new TextField();
        firstNameField.setFont(new Font("Arial", 16));
        lastNameField = new TextField();
        lastNameField.setFont(new Font("Arial", 16));
        emailField = new TextField();
        emailField.setFont(new Font("Arial", 16));
        inputFields.getChildren().addAll(usernameField, passwordField, confirmField, firstNameField, 
            lastNameField, emailField);


        registerBox.getChildren().addAll(inputLabels, inputFields);
        return registerBox;
    }

    public HBox createNavigationButtons(){
        navigationButtons = new HBox();
        navigationButtons.setAlignment(Pos.TOP_CENTER);
        navigationButtons.setSpacing(15);
        navigationButtons.setPadding(new Insets(20));

        backButton = new Button("Back");
        backButton.setPrefWidth(120);
        backButton.setOnAction(e -> {
        primaryStage.setScene(mainScene);
        });

        registerButton = new Button("Register User");
        registerButton.setPrefWidth(120);
        registerButton.setOnAction(e -> {});

        navigationButtons.getChildren().addAll(backButton, registerButton);
        return navigationButtons;
    }
}
