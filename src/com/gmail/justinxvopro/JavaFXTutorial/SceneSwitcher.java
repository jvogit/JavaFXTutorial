package com.gmail.justinxvopro.JavaFXTutorial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneSwitcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    Stage window;
    Scene first_scene, second_scene;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        
        createFirstScene();
        createSecondScene();
        
        window.setTitle("Scene switch demo");
        window.setScene(first_scene);
        window.show();
    }
    
    public void createFirstScene() {
        Label myLabel = new Label("First scene");
        Button first_scene_button = new Button("Go to scene 2");
        first_scene_button.setOnAction(e-> window.setScene(second_scene));
        
        VBox layout = new VBox(20);
        layout.getChildren().addAll(myLabel, first_scene_button);
        first_scene = new Scene(layout, 200, 200);
        
    }
    
    public void createSecondScene() {
        Label myLabel = new Label("Second scene");
        Button first_scene_button = new Button("Go to scene 1");
        first_scene_button.setOnAction(e-> window.setScene(first_scene));
        
        StackPane layout = new StackPane();
        layout.getChildren().addAll(myLabel, first_scene_button);
        second_scene = new Scene(layout, 500, 500);
    }
    
}
