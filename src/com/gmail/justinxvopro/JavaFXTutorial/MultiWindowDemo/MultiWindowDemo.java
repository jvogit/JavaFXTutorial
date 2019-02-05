package com.gmail.justinxvopro.JavaFXTutorial.MultiWindowDemo;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MultiWindowDemo extends Application {
    
    private Button myButton;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My JavaFX Stage");
        primaryStage.setOnCloseRequest(e-> {
            e.consume();
            this.closeFunction();
            Platform.exit();
        });
        myButton = new Button();
        myButton.setText("Click this button!");
        myButton.setOnAction(e->{
            boolean confirmation = ConfirmBox.display("Confirmation", "Are you sure?");
            System.out.println(confirmation);
        });
        
        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> {
            this.closeFunction();
            Platform.exit();
        });
        
        
        HBox layout = new HBox(10);
        layout.getChildren().addAll(myButton, closeButton);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    private void closeFunction() {
        System.out.println("Closing. . .");
    }
    
}
