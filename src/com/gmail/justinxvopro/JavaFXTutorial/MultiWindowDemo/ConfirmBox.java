package com.gmail.justinxvopro.JavaFXTutorial.MultiWindowDemo;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {
    
    public static boolean display(String title, String message) {
        Stage window = new Stage();
        boolean[] to = new boolean[] {true};
       
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        
        Label msg = new Label(message);
        Button yes = new Button("Yes"), no = new Button("No");
        
        yes.setOnAction(e -> {
            window.close();
        });
        
        no.setOnAction(e -> {
            to[0] = false;
            window.close();
        });
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(msg, yes, no);
        layout.setAlignment(Pos.CENTER);
        
        Scene alert_scene = new Scene(layout);
        window.setScene(alert_scene);
        window.showAndWait();
        
        return to[0];
    }
    
}
