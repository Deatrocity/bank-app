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

/**
 * SessionScene class that sets the scene for user account management.
 * This class creates the scene displayed after a successful login.
 */
public class SessionScene {

    /**
     * Creates the session scene.
     *
     * @param primaryStage The primary stage of the application.
     * @param mainScene    The main scene of the application.
     * @return The scene for the session.
     */
    public static Scene createSessionScene(Stage primaryStage, Scene mainScene) {
        return new Scene(createRootLayout(primaryStage, mainScene), 700, 620);
    }


    /**
     * Creates the root layout for the session scene.
     *
     * @param primaryStage The primary stage of the application.
     * @param mainScene    The main scene of the application.
     * @return The root layout for the session scene.
     */
    public static VBox createRootLayout(Stage primaryStage, Scene mainScene) {
        VBox rootLayout = new VBox();
        rootLayout.setAlignment(Pos.TOP_CENTER);
        rootLayout.setPadding(new Insets(20));

        Label mainLabel = new Label("Deatrick Peoples Bank");
        mainLabel.setPadding(new Insets(0, 0, 10 , 0));
        mainLabel.setFont(new Font("Arial", 30));

        Label greetingLabel = new Label("Hello, Ethan!");
        greetingLabel.setPadding(new Insets(0, 0, 15 , 0));
        greetingLabel.setFont(new Font("Arial", 15));

        rootLayout.getChildren().addAll(
            mainLabel, greetingLabel, navigationBox(rootLayout), AccountSummary.createAccountSummary(),
            exitButtons(primaryStage, mainScene));

        return rootLayout;
    }


    /**
     * Creates the navigation buttons box.
     *
     * @param rootLayout The root layout of the session scene.
     * @return The HBox containing navigation buttons.
     */
    public static HBox navigationBox(VBox rootLayout){
        // HBox holding four buttons for navigating account
        HBox navigationButtons = new HBox();
        navigationButtons.setAlignment(Pos.CENTER);
        navigationButtons.setSpacing(20);

        // Account Summary button shows information about user account
        Button accountSummaryButton = new Button("Account Summary");
        accountSummaryButton.setPrefWidth(120);
        accountSummaryButton.setOnAction(e -> {
            rootLayout.getChildren().remove(3);
            rootLayout.getChildren().add(3, AccountSummary.createAccountSummary());
            
        });

        // Check Balance Button shows checkings and savings balance
        Button checkBalanceButton = new Button("Check Balance");
        checkBalanceButton.setPrefWidth(120);
        checkBalanceButton.setOnAction(e -> {
            rootLayout.getChildren().remove(3);
            rootLayout.getChildren().add(3, CheckBalances.createCheckBalances());
        });

        // Deposit Button lets user deposit money into checkings or savings
        Button depositButton = new Button("Deposit");
        depositButton.setPrefWidth(120);
        depositButton.setOnAction(e -> {
            rootLayout.getChildren().remove(3);
            rootLayout.getChildren().add(3, Deposit.createDeposit());
        });

        // Withdraw Button lets user withdraw money from checkings or savings
        Button withdrawButton = new Button("Withdraw");
        withdrawButton.setPrefWidth(120);
        withdrawButton.setOnAction(e -> {
            rootLayout.getChildren().remove(3);
            rootLayout.getChildren().add(3, Withdraw.createWithdraw());
        });

        navigationButtons.getChildren().addAll(accountSummaryButton, checkBalanceButton, depositButton, withdrawButton);
        return navigationButtons;
    }


    /**
     * Creates the exit buttons box.
     *
     * @param primaryStage The primary stage of the application.
     * @param mainScene    The main scene of the application.
     * @return The HBox containing exit buttons.
     */
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
