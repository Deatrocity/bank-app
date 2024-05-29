package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public abstract class AccountSummary {
    
    public static HBox createAccountSummary(){
        HBox layout = new HBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(30);
        layout.setPadding(new Insets(20));
        layout.setMinHeight(450); // Set minimum height
        layout.setPrefHeight(450); // Set preferred height
        layout.setMaxHeight(450); // Set maximum height

        Label label = new Label("Account Summary");

        layout.getChildren().addAll(label);
        return layout;
    }
}
