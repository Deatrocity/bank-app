package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RegisterScene {
    
    private Stage primaryStage;
    private Scene registerScene, mainScene;
    private Label mainLabel, registerLabel;
    private VBox rootLayout;
    private HBox navigationButtons;
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

        rootLayout.getChildren().addAll(mainLabel, registerLabel, createNavigationButtons());
        return rootLayout;
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
