package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

public class AccountSummary {
    
    public static HBox createAccountSummary(){
        HBox layout = new HBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(30);
        layout.setPadding(new Insets(20));


        Label label = new Label("This is label 1");
        ListView recentActivityList = new ListView();


        layout.getChildren().addAll(label, recentActivityList);
        return layout;
    }
}
