package com.gmail.justinxvopro.JavaFXTutorial.EmbedLayout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GriddingMain extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My JavaFX Stage");
        
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setVgap(8);
        pane.setHgap(10);
        
        //Name label
        Label name = new Label("Name:");
        GridPane.setConstraints(name, 0, 0);
        
        //Name input
        TextField name_field = new TextField();
        name_field.setPromptText("Username Prompt Text");
        GridPane.setConstraints(name_field, 1, 0);
        
        //Pass label
        Label pass = new Label("Password:");
        GridPane.setConstraints(pass, 0, 1);
        
        //Pass input
        TextField pass_field = new TextField();
        pass_field.setPromptText("Password Prompt Text");
        GridPane.setConstraints(pass_field, 1, 1);
        
        //Login button
        Button login = new Button("Login");
        GridPane.setConstraints(login, 1, 2);
        
        pane.getChildren().addAll(name, name_field, pass, pass_field, login);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 500, 350);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
