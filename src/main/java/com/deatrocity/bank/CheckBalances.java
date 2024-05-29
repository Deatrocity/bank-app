package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

public class CheckBalances {

    public static HBox createCheckBalances(){
        HBox rootLayout = new HBox();
        rootLayout.setAlignment(Pos.CENTER);
        rootLayout.setSpacing(30);
        rootLayout.setPadding(new Insets(20));
        rootLayout.setMinHeight(450); // Set minimum height
        rootLayout.setPrefHeight(450); // Set preferred height
        rootLayout.setMaxHeight(450); // Set maximum height


        Label checkingLabel = new Label("Checking");
        Label savingLabel = new Label("Saving");
        ListView checkingRecentActivity = new ListView();
        ListView savingRecentActivity = new ListView();


        rootLayout.getChildren().addAll(checkingLabel, checkingRecentActivity, savingLabel, savingRecentActivity);
        return rootLayout;
    }
    
}
