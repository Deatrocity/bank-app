package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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
        HBox layout = new HBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(30);
        layout.setPadding(new Insets(20));
        layout.setMinHeight(450);
        layout.setPrefHeight(450);
        layout.setMaxHeight(450);
        
        Label label = new Label("Account Summary");

        layout.getChildren().addAll(label);
        return layout;
    }
}
