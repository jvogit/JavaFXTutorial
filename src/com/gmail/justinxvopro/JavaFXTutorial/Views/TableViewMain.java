package com.gmail.justinxvopro.JavaFXTutorial.Views;

import java.util.Arrays;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewMain extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TableView");
        
        TableView<TableProduct> table = new TableView<>();
        
        TableColumn<TableProduct, String> nameCol = new TableColumn<>("Name"), priceCol = new TableColumn<>("price"), quanCol = new TableColumn<>("Quantity");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        nameCol.setMinWidth(100);
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        priceCol.setMinWidth(100);
        quanCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        quanCol.setMinWidth(100);
        
        table.setItems(FXCollections.observableArrayList(Arrays.asList(
        	
        	new TableProduct("Computer", 100, 10),
        	new TableProduct("Mouse", 10, 20),
        	new TableProduct("Monitor", 100, 2)
        	
        	)));
        table.getColumns().addAll(nameCol, priceCol, quanCol);
        
        
        VBox pane = new VBox();
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.getChildren().addAll(table);
        
        Scene scene = new Scene(pane);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
}
