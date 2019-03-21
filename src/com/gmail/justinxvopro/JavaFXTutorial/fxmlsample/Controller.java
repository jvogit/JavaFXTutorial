package com.gmail.justinxvopro.JavaFXTutorial.fxmlsample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class Controller implements Initializable {
    
    @FXML
    private VBox record_items;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
	Node[] nodes = new Node[3];
        for (int i = 0; i < nodes.length; i++) {
            try {

                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("RecordItem.fxml"));

                //give the items some effect

                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #A4A4A4");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : transparent");
                });
                record_items.getChildren().add(nodes[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    @FXML
    void exit_button_action(ActionEvent event) {
	System.exit(1);
    }
    
}
