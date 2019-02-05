package com.gmail.justinxvopro.JavaFXTutorial.Views;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewMain extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ListView");
        
        ListView<String> view = new ListView<>();
        view.getItems().addAll("John", "Justin", "Julie");
        view.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        view.getSelectionModel().selectedItemProperty().addListener((l, b, a)-> {
            view.getSelectionModel().getSelectedItems().forEach(System.out::println);
        });
        
        VBox pane = new VBox(10);
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.getChildren().addAll(view);
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
}
