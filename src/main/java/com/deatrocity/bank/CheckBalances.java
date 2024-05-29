package com.deatrocity.bank;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

public class CheckBalances {

    public static HBox createCheckBalances(){
        HBox layout = new HBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(30);
        layout.setPadding(new Insets(20));


        Label checkingLabel = new Label("Checking");
        Label savingLabel = new Label("Saving");
        ListView checkingRecentActivity = new ListView();
        ListView savingRecentActivity = new ListView();


        layout.getChildren().addAll(checkingLabel, savingLabel, checkingRecentActivity, savingRecentActivity);
        return layout;
    }
    
}
