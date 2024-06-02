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

    private Scene sessionScene, mainScene;
    private Stage primaryStage;
    private VBox rootLayout;
    private HBox navigationButtons, exitButtons;
    private Label mainLabel, greetingLabel;
    private Button accountSummaryButton, checkBalanceButton, depositButton, withdrawButton, 
        logoutButton;

    SessionScene(Stage primaryStage, Scene mainScene){
        this.primaryStage = primaryStage;
        this.mainScene = mainScene;
    }

    /**
     * Creates the session scene.
     *
     * @param primaryStage The primary stage of the application.
     * @param mainScene    The main scene of the application.
     * @return The scene for the session.
     */
    public Scene createSessionScene() {
        sessionScene = new Scene(rootLayout(), 750, 620);
        return sessionScene;
    }

    /**
     * Creates the root layout for the session scene.
     *
     * @param primaryStage The primary stage of the application.
     * @param mainScene    The main scene of the application.
     * @return The root layout for the session scene.
     */
    public VBox rootLayout() {
        rootLayout = new VBox();
        rootLayout.setAlignment(Pos.TOP_CENTER);
        rootLayout.setPadding(new Insets(20));

        mainLabel = new Label("Deatrick Peoples Bank");
        mainLabel.setPadding(new Insets(0, 0, 10 , 0));
        mainLabel.setFont(new Font("Arial", 30));

        greetingLabel = new Label("Hello, Ethan!");
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
    public HBox navigationBox(VBox rootLayout){
        // HBox holding four buttons for navigating account
        navigationButtons = new HBox();
        navigationButtons.setAlignment(Pos.CENTER);
        navigationButtons.setSpacing(20);

        // Account Summary button shows information about user account
        accountSummaryButton = new Button("Account Summary");
        accountSummaryButton.setPrefWidth(120);
        accountSummaryButton.setOnAction(e -> {
            rootLayout.getChildren().remove(3);
            rootLayout.getChildren().add(3, AccountSummary.createAccountSummary());
            
        });

        // Check Balance Button shows checkings and savings balance
        checkBalanceButton = new Button("Check Balance");
        checkBalanceButton.setPrefWidth(120);
        checkBalanceButton.setOnAction(e -> {
            rootLayout.getChildren().remove(3);
            rootLayout.getChildren().add(3, CheckBalances.createCheckBalances());
        });

        // Deposit Button lets user deposit money into checkings or savings
        depositButton = new Button("Deposit");
        depositButton.setPrefWidth(120);
        depositButton.setOnAction(e -> {
            rootLayout.getChildren().remove(3);
            rootLayout.getChildren().add(3, Deposit.createDeposit());
        });

        // Withdraw Button lets user withdraw money from checkings or savings
        withdrawButton = new Button("Withdraw");
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
    public HBox exitButtons(Stage primaryStage, Scene mainScene){
        // Hbox stores exit and logout buttons horizontally - exit button is WIP
        exitButtons = new HBox();
        exitButtons.setAlignment(Pos.CENTER);
        exitButtons.setPrefWidth(120);

        // Logout Button ends user session and returns to main frame
        logoutButton = new Button("Logout");
        logoutButton.setPrefWidth(120);
        logoutButton.setOnAction(e -> {
            primaryStage.setScene(mainScene);
        });


        exitButtons.getChildren().addAll(logoutButton);
        return exitButtons;
    }
}
