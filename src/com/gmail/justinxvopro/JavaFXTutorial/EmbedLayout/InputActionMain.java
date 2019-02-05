package com.gmail.justinxvopro.JavaFXTutorial.EmbedLayout;

import com.gmail.justinxvopro.JavaFXTutorial.MultiWindowDemo.AlertBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InputActionMain extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My JavaFX Stage");
        
        TextField field = new TextField();
        field.setPromptText("Type in value here");
        
        Button submit = new Button("Submit");
        submit.setOnAction(e->{
            AlertBox.display("TextField", field.getText());
        });
        
        VBox pane = new VBox(10);
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.getChildren().addAll(field, submit);
        pane.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
