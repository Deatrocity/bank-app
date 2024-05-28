package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SessionScene {
    
    public static Scene createSessionScene(Stage primaryStage, Scene mainScene) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        Label mainLabel = new Label("My Bank Application");
        Label greetingLabel = new Label("Hello <name>");

        root.getChildren().addAll(
            mainLabel, greetingLabel, navigationBox(), AccountSummary.createAccountSummary(),
            exitButtons(primaryStage, mainScene));

        return new Scene(root, 600, 400);
    }

    public static HBox navigationBox(){
        // HBox holding four buttons for navigating account
        HBox navigationButtons = new HBox();
        navigationButtons.setAlignment(Pos.CENTER);
        navigationButtons.setSpacing(15);

        // Account Summary button shows information about user account
        Button accountSummaryButton = new Button("Account Summary");
        accountSummaryButton.setPrefWidth(120);
        accountSummaryButton.setOnAction(e -> {
            System.out.println("Account Summary");
        });

        // Check Balance Button shows checkings and savings balance
        Button checkBalanceButton = new Button("Check Balance");
        checkBalanceButton.setPrefWidth(120);
        checkBalanceButton.setOnAction(e -> {
            System.out.println("Check Balance");
        });

        // Deposit Button lets user deposit money into checkings or savings
        Button depositButton = new Button("Deposit");
        depositButton.setPrefWidth(120);
        depositButton.setOnAction(e -> {
            System.out.println("Deposit");
        });

        // Withdraw Button lets user withdraw money from checkings or savings
        Button withdrawButton = new Button("Withdraw");
        withdrawButton.setPrefWidth(120);
        withdrawButton.setOnAction(e -> {
            System.out.println("Withdraw");
        });

        navigationButtons.getChildren().addAll(accountSummaryButton, checkBalanceButton, depositButton, withdrawButton);
        return navigationButtons;
    }

    public static HBox exitButtons(Stage primaryStage, Scene mainScene){
        // Hbox stores exit and logout buttons horizontally - exit button is WIP
        HBox exitButtons = new HBox();
        exitButtons.setAlignment(Pos.CENTER);
        exitButtons.setPrefWidth(120);

        // Logout Button ends user session and returns to main frame
        Button logoutButton = new Button("Logout");
        logoutButton.setPrefWidth(120);
        logoutButton.setOnAction(e -> {
            primaryStage.setScene(mainScene);
        });


        exitButtons.getChildren().addAll(logoutButton);
        return exitButtons;
    }
}
