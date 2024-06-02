package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * AccountSummary class creates HBox layout to display user account information.
 * This class provides a method to create the layout for checking and saving account balances.
 */
public abstract class AccountSummary {
    
     /**
     * Creates the layout for displaying account summary information.
     *
     * @return The HBox containing the layout for account summary.
     */
    public static HBox createAccountSummary(){
        HBox rootLayout = new HBox();
        rootLayout.setAlignment(Pos.CENTER);
        rootLayout.setSpacing(60); // Space between left root and right root
        rootLayout.setPadding(new Insets(80, 20, 20, 20));
        rootLayout.setMinHeight(450);
        rootLayout.setPrefHeight(450);
        rootLayout.setMaxHeight(450);

        // Create left HBox layout containing two VBoxes
        HBox leftRoot = new HBox();
        leftRoot.setSpacing(15); // space between LL and RR
        VBox leftRootL = leftRootL();
        VBox leftRootR = leftRootR();
        leftRoot.getChildren().addAll(leftRootL, leftRootR);
 
        // Create right HBox layout containing two VBoxes
        HBox rightRoot = new HBox();
        rightRoot.setSpacing(15); // space between RL and RR
        VBox rightRootL = rightRootL();
        VBox rightRootR = rightRootR();
        rightRoot.getChildren().addAll(rightRootL, rightRootR);

        rootLayout.getChildren().addAll(leftRoot, rightRoot);
        return rootLayout;
    }
    
    // left root
    public static HBox leftRoot(){
        HBox leftRoot = new HBox();
        return leftRoot; 
    }
    // LL
    public static VBox leftRootL(){
        VBox leftRootL = new VBox();
        leftRootL.setSpacing(10);
        leftRootL.setAlignment(Pos.TOP_RIGHT);

        Label name = new Label("Name:");
        Label email = new Label("Email:");
        Label password = new Label("Password:");
        Label creationDate = new Label("Creation Date:");
        Button changePassword = new Button("Change Password");

        // Set font for labels
        Font font = Font.font("Arial", FontWeight.BOLD, 16); // Specify your desired font and size
        name.setFont(font);
        email.setFont(font);
        password.setFont(font);
        creationDate.setFont(font);

        leftRootL.getChildren().addAll(name, email, password, creationDate, changePassword);
        return leftRootL;
    }
    // LR
    public static VBox leftRootR(){
        VBox leftRootR = new VBox();
        leftRootR.setSpacing(10);

        Label nameValue = new Label("Ethan Deatrick");
        Label emailValue = new Label("Ethan.Deatrick.Ethan@email.com");
        Label passwordValue = new Label("*****************");
        Label creationDateValue = new Label("5/29/2024");

        // Set font for labels
        Font font = new Font("Arial", 16); // Specify your desired font and size
        nameValue.setFont(font);
        emailValue.setFont(font);
        passwordValue.setFont(font);
        creationDateValue.setFont(font);
        
        leftRootR.getChildren().addAll(nameValue, emailValue, passwordValue, creationDateValue);
        return leftRootR;
    }

    // Right root
    public static HBox rightRoot(){
        HBox rightRoot = new HBox();
        return rightRoot; 
    }
    // RL
    public static VBox rightRootL(){
        VBox rightRootL = new VBox();
        rightRootL.setSpacing(10);
        rightRootL.setAlignment(Pos.TOP_RIGHT);

        Label checkingLabel = new Label("Checking:");
        Label savingsLabel = new Label("Savings:");

        Font font = Font.font("Arial", FontWeight.BOLD, 16); // Specify bold font and size
        checkingLabel.setFont(font);
        savingsLabel.setFont(font);

        rightRootL.getChildren().addAll(checkingLabel, savingsLabel);
        return rightRootL;
    }
    // RR
    public static VBox rightRootR(){
        VBox rightRootR = new VBox();
        rightRootR.setSpacing(10);

        Label checkingValue = new Label("$5,321,205.25");
        Label savingsValue = new Label("$152,343,206.23");

        // Set font for labels
        Font font = new Font("Arial", 16); // Specify your desired font and size
        checkingValue.setFont(font);
        savingsValue.setFont(font);

        rightRootR.getChildren().addAll(checkingValue, savingsValue);
        return rightRootR;
    }
}


