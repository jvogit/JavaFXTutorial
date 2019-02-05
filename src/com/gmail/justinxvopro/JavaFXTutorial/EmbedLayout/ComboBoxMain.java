package com.gmail.justinxvopro.JavaFXTutorial.EmbedLayout;

import com.gmail.justinxvopro.JavaFXTutorial.MultiWindowDemo.AlertBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxMain extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Survey");
        
        ComboBox<String> combos = new ComboBox<>();
        
        combos.getItems().addAll("Bird", "Plane", "Superman");
        combos.setPromptText("What's in the sky?");
        combos.setOnAction(e->System.out.println(combos.getValue()));
        
        Button submit = new Button("Submit");
        submit.setOnAction(e->{
            AlertBox.display("Result", combos.getValue());
            combos.getSelectionModel().clearSelection();
        });
        
        VBox pane = new VBox(10);
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.getChildren().addAll(combos, submit);
        pane.setAlignment(Pos.TOP_LEFT);
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
}
