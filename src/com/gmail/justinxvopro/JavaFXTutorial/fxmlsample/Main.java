package com.gmail.justinxvopro.JavaFXTutorial.fxmlsample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    private double x, y;
    
    public static void main(String[] args) {
	Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
	Pane pane = FXMLLoader.load(Main.class.getResource("MainMenu.fxml"));
	
	Scene scene = new Scene(pane);
	primaryStage.initStyle(StageStyle.UNDECORATED);
	pane.setOnMousePressed(event -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });
        pane.setOnMouseDragged(event -> {

            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);

        });
	primaryStage.setScene(scene);
	primaryStage.show();
    }
    
}
