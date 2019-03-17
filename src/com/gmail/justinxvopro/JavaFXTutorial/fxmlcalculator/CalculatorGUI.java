package com.gmail.justinxvopro.JavaFXTutorial.fxmlcalculator;

import com.gmail.justinxvopro.JavaFXTutorial.calculator.Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CalculatorGUI extends Application {
    
    protected static Calculator calc = new Calculator();
    protected static boolean awaiting_operator = false;
    
    public static void main(String[] args) {
	Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
	Pane mainPane = (Pane) FXMLLoader.load(CalculatorGUI.class.getResource("CalculatorGUI.fxml"));
	
	primaryStage.setScene(new Scene(mainPane));
	primaryStage.setTitle("Calculator");
	primaryStage.setResizable(false);
	primaryStage.show();
    }
    	
}
