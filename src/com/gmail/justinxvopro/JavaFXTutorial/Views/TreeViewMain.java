package com.gmail.justinxvopro.JavaFXTutorial.Views;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TreeViewMain extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ListView");
        
        TreeView<String> view = new TreeView<>();
        TreeItem<String> root = new TreeItem<>(), mesa = makeBranch(root, "MESA"), nhs = makeBranch(root, "NHS");
        
        makeBranch(mesa, "Members");
        TreeItem<String> project = makeBranch(mesa, "Projects");
        makeBranch(project, "Arduino");
        makeBranch(nhs, "Members");
        makeBranch(nhs, "Hours");
        
        root.setExpanded(true);
        
        view.setRoot(root);
        view.setShowRoot(false);
        
        view.getSelectionModel().selectedItemProperty().addListener((l, b, a)->{
            System.out.println(String.format("b: %s, a: %s", b, a));
        });
        
        StackPane pane = new StackPane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.getChildren().addAll(view);
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
    private TreeItem<String> makeBranch(TreeItem<String> parent, String name){
        TreeItem<String> item = new TreeItem<>(name);
        parent.getChildren().add(item);
        
        return item;
    }
    
}
