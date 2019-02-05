package com.gmail.justinxvopro.JavaFXTutorial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    
    private Button myButton;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My JavaFX Stage");
        myButton = new Button();
        myButton.setText("Click this button!");
        myButton.setOnAction(e->{
            System.out.println("Hello!");
        });
        
        StackPane layout = new StackPane();
        layout.getChildren().add(myButton);
        
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
