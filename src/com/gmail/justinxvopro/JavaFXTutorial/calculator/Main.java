package com.gmail.justinxvopro.JavaFXTutorial.calculator;

import java.util.Arrays;

import com.gmail.justinxvopro.JavaFXTutorial.MultiWindowDemo.AlertBox;
import com.gmail.justinxvopro.JavaFXTutorial.calculator.PostFixInterpreter.Operator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    
    private static final HBox TOP = getTop();
    private static final GridPane CENTER = getCenter();
    private static final VBox RIGHT = getRight();
    private static boolean awaiting_operator = false;
    private static Calculator calc = new Calculator();
    
    public static void main(String[] args) {
	launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
	BorderPane mainPane = new BorderPane();
	
	mainPane.setTop(TOP);
	
	mainPane.setCenter(CENTER);
	
	mainPane.setRight(RIGHT);
	
	mainPane.setPadding(new Insets(10, 10, 10, 10));
	
	Scene scene = new Scene(mainPane);
	primaryStage.setScene(scene);
	primaryStage.setTitle("cool calc");
	primaryStage.show();
    }
    
    public static HBox getTop() {
	HBox box = new HBox();
	
	TextField field = new TextField("");
	field.setEditable(false);
	box.getChildren().add(field);
	box.setAlignment(Pos.TOP_CENTER);
	return box;
    }
    
    public static VBox getRight() {
	VBox box = new VBox(10);
	Button addition =  new Button("+");
	Button subtraction =  new Button("-");
	Button multiplication =  new Button("*");
	Button division =  new Button("/");
	Button equal = new Button("=");
	
	addition.setOnAction(e->{
	    if(awaiting_operator) {
		TextField field = (TextField) TOP.getChildren().get(0);
		calc.push_number(Double.parseDouble(field.getText()), Operator.ADD);
		awaiting_operator = false;
	    }
	});
	subtraction.setOnAction(e->{
	    if(awaiting_operator) {
		TextField field = (TextField) TOP.getChildren().get(0);
		calc.push_number(Double.parseDouble(field.getText()), Operator.SUBTRACT);
		awaiting_operator = false;
	    }
	});
	multiplication.setOnAction(e->{
	    if(awaiting_operator) {
		TextField field = (TextField) TOP.getChildren().get(0);
		calc.push_number(Double.parseDouble(field.getText()), Operator.MULTIPLY);
		awaiting_operator = false;
	    }
	});
	division.setOnAction(e->{
	    if(awaiting_operator) {
		TextField field = (TextField) TOP.getChildren().get(0);
		calc.push_number(Double.parseDouble(field.getText()), Operator.DIVIDE);
		awaiting_operator = false;
	    }
	});
	equal.setOnAction(e->{
	    TextField field = (TextField) TOP.getChildren().get(0);
	    calc.push_number(Double.parseDouble(field.getText()), null);
	    awaiting_operator = false;
	    field.setText("");
	    AlertBox.display("Result", calc.calculate() + "");
	});
	
	box.getChildren().addAll(addition, subtraction, multiplication, division, equal);
	
	box.setAlignment(Pos.TOP_CENTER);
	
	return box;
    }
    
    public static GridPane getCenter() {
	GridPane pane = new GridPane();
	pane.setHgap(10);
	pane.setVgap(10);
	
	Button[] buttons = new Button[12];
	
	for(int i = 0; i < 10; i++) {
	    buttons[i] = new Button(i+"");
	    int f = i;
	    buttons[i].setOnAction(e -> {
		TextField field = (TextField) TOP.getChildren().get(0);	
		if(!awaiting_operator) {
		    field.setText(f +"");
		    awaiting_operator = true;
		}else {
		    field.setText(field.getText() + f + "");
		}
	    });
	}
	
	buttons[10] = new Button(".");
	buttons[11] = new Button("(-)");
	
	buttons[10].setOnAction(e->{
	    TextField field = (TextField) TOP.getChildren().get(0);
	    if(!field.getText().contains(".")) {
		field.setText(field.getText() + ".");
	    }
	});
	buttons[11].setOnAction(e->{
	    TextField field = (TextField) TOP.getChildren().get(0);
	    if(field.getText().length() > 0)
        	    if(field.getText().charAt(0) != '-') {
        		field.setText("-"+field.getText());
        	    } else {
        		field.setText(field.getText().substring(1, field.getText().length()));
        	    }
    	});
	
	String[][] layout = {
		{"7", "8", "9"},
		{"4", "5", "6"},
		{"1", "2", "3"},
		{"0", ".", "(-)"}
	};
	
	//lol
	for(int row = 0; row < layout.length; row++) {
	    for(int col = 0; col < layout[0].length; col++) {
		String atVal = layout[row][col];
		for(Button b : buttons) {
		    if(b.getText().equalsIgnoreCase(atVal)) {
			GridPane.setConstraints(b, col, row);
			break;
		    }
		}
	    }
	}
	
	pane.getChildren().addAll(Arrays.asList(buttons));
	pane.setAlignment(Pos.TOP_CENTER);
	
	return pane;
    }
    
}
