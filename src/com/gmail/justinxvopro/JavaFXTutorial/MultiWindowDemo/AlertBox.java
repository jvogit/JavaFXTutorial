package com.gmail.justinxvopro.JavaFXTutorial.MultiWindowDemo;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    
    public static void display(String title, String message) {
        Stage window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        
        Label msg = new Label(message);
        Button close_btn = new Button("Okay");
        
        close_btn.setOnAction(e -> window.close());
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(msg, close_btn);
        layout.setAlignment(Pos.CENTER);
        
        Scene alert_scene = new Scene(layout);
        window.setScene(alert_scene);
        window.showAndWait();
    }
    
}
