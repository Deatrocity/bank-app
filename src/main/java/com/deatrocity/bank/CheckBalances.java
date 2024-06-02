package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * CheckBalances class responsible for creating the layout to display account balances.
 * This class provides a method to create the layout for checking and saving account balances.
 */
public class CheckBalances {

    private static HBox rootLayout;
    private static VBox checkingBox, savingsBox;
    private static Label checkingLabel, savingsLabel;
    private static ListView checkingListView, savingsListView;

     /**
     * Creates the layout to display checking and saving account balances.
     *
     * @return The HBox containing the layout for checking and saving account balances.
     */
    public static HBox createCheckBalances(){
        rootLayout = new HBox();
        rootLayout.setAlignment(Pos.CENTER);
        rootLayout.setSpacing(30);
        rootLayout.setPadding(new Insets(20));
        rootLayout.setMinHeight(450); // Set minimum height
        rootLayout.setPrefHeight(450); // Set preferred height
        rootLayout.setMaxHeight(450); // Set maximum height

        // Add nodes to rootLayout of check balances HBox
        rootLayout.getChildren().addAll(createCheckingBox(), createSavingsBox());
        return rootLayout;
    }
  
    public static VBox createCheckingBox(){
        checkingBox = new VBox();
        checkingBox.setAlignment(Pos.CENTER);
        checkingLabel = new Label("Checking Account");
        checkingListView = new ListView();
        checkingBox.getChildren().addAll(checkingLabel, checkingListView);
        return checkingBox;
    }

    public static VBox createSavingsBox(){
        savingsBox = new VBox();
        savingsBox.setAlignment(Pos.CENTER);
        savingsLabel = new Label("Savings Account");
        savingsListView = new ListView();
        savingsBox.getChildren().addAll(savingsLabel, savingsListView);
        return savingsBox; 
    }
    
}
