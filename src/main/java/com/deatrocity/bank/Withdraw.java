package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 * Withdraw class responsible for creating the layout for withdrawal functionality.
 * This class provides a method to create the layout for withdrawing funds.
 */
public class Withdraw {
    
    /**
     * Creates the layout for withdrawal functionality.
     *
     * @return The HBox containing the layout for withdrawing funds.
     */
    public static HBox createWithdraw(){
        HBox layout = new HBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(30);
        layout.setPadding(new Insets(20));
        layout.setMinHeight(450); 
        layout.setPrefHeight(450); 
        layout.setMaxHeight(450); 

        Label mainLabel = new Label("Withdraw!");
        
        layout.getChildren().addAll(mainLabel);
        return layout;
    }
}
