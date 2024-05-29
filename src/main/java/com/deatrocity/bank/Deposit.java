package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

public class Deposit {
    
    public static HBox createDeposit(){
        HBox layout = new HBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(30);
        layout.setPadding(new Insets(20));
        layout.setMinHeight(450); // Set minimum height
        layout.setPrefHeight(450); // Set preferred height
        layout.setMaxHeight(450); // Set maximum height


        Label mainLabel = new Label("Deposit!");
        


        layout.getChildren().addAll(mainLabel);
        return layout;
    }
}
