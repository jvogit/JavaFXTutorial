package com.gmail.justinxvopro.JavaFXTutorial.EmbedLayout;

import com.gmail.justinxvopro.JavaFXTutorial.MultiWindowDemo.AlertBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxMain extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My JavaFX Stage");
        
        //CheckBox
        CheckBox first_cb = new CheckBox("A");
        first_cb.setSelected(true);
        CheckBox sec_cb = new CheckBox("B");
        
        Button submit = new Button("Submit");
        submit.setOnAction(e->{
            AlertBox.display("Options", String.format("A: %b B: %b", first_cb.isSelected(), sec_cb.isSelected()));
        });
        
        VBox pane = new VBox(10);
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.getChildren().addAll(first_cb, sec_cb, submit);
        pane.setAlignment(Pos.TOP_LEFT);
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
}
