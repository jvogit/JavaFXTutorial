package com.gmail.justinxvopro.JavaFXTutorial.EmbedLayout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmbedLayoutMain extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My JavaFX Stage");
        
        HBox topMenu = new HBox();
        Button a = new Button("A");
        Button b = new Button("B");
        topMenu.getChildren().addAll(a, b);
        
        VBox leftMenu = new VBox();
        Button c = new Button("C");
        Button d = new Button("D");
        leftMenu.getChildren().addAll(c, d);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);
        
        Scene scene = new Scene(borderPane, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
