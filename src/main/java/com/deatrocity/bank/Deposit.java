package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

/**
 * Deposit class responsible for creating the layout for deposit functionality.
 * This class provides a method to create the layout for depositing funds.
 */
public class Deposit {
    
     /**
     * Creates the layout for deposit functionality.
     *
     * @return The HBox containing the layout for depositing funds.
     */
    public static HBox createDeposit(){
        HBox rootLayout = new HBox();
        rootLayout.setAlignment(Pos.CENTER);
        rootLayout.setSpacing(30);
        rootLayout.setPadding(new Insets(20));
        rootLayout.setMinHeight(450);
        rootLayout.setPrefHeight(450);
        rootLayout.setMaxHeight(450);

        Label mainLabel = new Label("Deposit!");

        // Add nodes to rootLayout of HBox
        rootLayout.getChildren().addAll(mainLabel);
        return rootLayout;
    }
}
