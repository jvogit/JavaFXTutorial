package com.gmail.justinxvopro.JavaFXTutorial.fxmlcalculator;

import com.gmail.justinxvopro.JavaFXTutorial.calculator.PostFixInterpreter.Operator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class CalculatorController {
    
    @FXML
    private TextField output_tf;

    @FXML
    void input_0(ActionEvent event) {
	int num = 0;
	output_tf.setAlignment(Pos.CENTER_RIGHT);
	if(!CalculatorGUI.awaiting_operator) {
	    output_tf.setText(num+"");
	    CalculatorGUI.awaiting_operator = true;
	}else {
	    output_tf.setText(output_tf.getText() + num);
	}
    }

    @FXML
    void input_1(ActionEvent event) {
	int num = 1;
	output_tf.setAlignment(Pos.CENTER_RIGHT);
	if(!CalculatorGUI.awaiting_operator) {
	    output_tf.setText(num+"");
	    CalculatorGUI.awaiting_operator = true;
	}else {
	    output_tf.setText(output_tf.getText() + num);
	}
    }

    @FXML
    void input_2(ActionEvent event) {
	int num = 2;
	output_tf.setAlignment(Pos.CENTER_RIGHT);
	if(!CalculatorGUI.awaiting_operator) {
	    output_tf.setText(num+"");
	    CalculatorGUI.awaiting_operator = true;
	}else {
	    output_tf.setText(output_tf.getText() + num);
	}
    }

    @FXML
    void input_3(ActionEvent event) {
	int num = 3;
	output_tf.setAlignment(Pos.CENTER_RIGHT);
	if(!CalculatorGUI.awaiting_operator) {
	    output_tf.setText(num+"");
	    CalculatorGUI.awaiting_operator = true;
	}else {
	    output_tf.setText(output_tf.getText() + num);
	}
    }

    @FXML
    void input_4(ActionEvent event) {
	int num = 4;
	output_tf.setAlignment(Pos.CENTER_RIGHT);
	if(!CalculatorGUI.awaiting_operator) {
	    output_tf.setText(num+"");
	    CalculatorGUI.awaiting_operator = true;
	}else {
	    output_tf.setText(output_tf.getText() + num);
	}
    }

    @FXML
    void input_5(ActionEvent event) {
	int num = 5;
	output_tf.setAlignment(Pos.CENTER_RIGHT);
	if(!CalculatorGUI.awaiting_operator) {
	    output_tf.setText(num+"");
	    CalculatorGUI.awaiting_operator = true;
	}else {
	    output_tf.setText(output_tf.getText() + num);
	}
    }

    @FXML
    void input_6(ActionEvent event) {
	int num = 6;
	output_tf.setAlignment(Pos.CENTER_RIGHT);
	if(!CalculatorGUI.awaiting_operator) {
	    output_tf.setText(num+"");
	    CalculatorGUI.awaiting_operator = true;
	}else {
	    output_tf.setText(output_tf.getText() + num);
	}
    }

    @FXML
    void input_7(ActionEvent event) {
	int num = 7;
	output_tf.setAlignment(Pos.CENTER_RIGHT);
	if(!CalculatorGUI.awaiting_operator) {
	    output_tf.setText(num+"");
	    CalculatorGUI.awaiting_operator = true;
	}else {
	    output_tf.setText(output_tf.getText() + num);
	}
    }

    @FXML
    void input_8(ActionEvent event) {
	int num = 8;
	output_tf.setAlignment(Pos.CENTER_RIGHT);
	if(!CalculatorGUI.awaiting_operator) {
	    output_tf.setText(num+"");
	    CalculatorGUI.awaiting_operator = true;
	}else {
	    output_tf.setText(output_tf.getText() + num);
	}
    }

    @FXML
    void input_9(ActionEvent event) {
	int num = 9;
	output_tf.setAlignment(Pos.CENTER_RIGHT);
	if(!CalculatorGUI.awaiting_operator) {
	    output_tf.setText(num+"");
	    CalculatorGUI.awaiting_operator = true;
	}else {
	    output_tf.setText(output_tf.getText() + num);
	}
    }

    @FXML
    void input_add(ActionEvent event) {
	if(CalculatorGUI.awaiting_operator) {
		CalculatorGUI.calc.push_number(Double.parseDouble(output_tf.getText()), Operator.ADD);
		CalculatorGUI.awaiting_operator = false;
	}
    }

    @FXML
    void input_decimal(ActionEvent event) {
	output_tf.setAlignment(Pos.CENTER_RIGHT);
	if(!output_tf.getText().contains(".")) {
	    if(!output_tf.getText().isEmpty())
		output_tf.setText(output_tf.getText() + ".");
	    else {
		output_tf.setText("0.");
		CalculatorGUI.awaiting_operator = true;
	    }
	}
    }

    @FXML
    void input_divide(ActionEvent event) {
	if(CalculatorGUI.awaiting_operator) {
		CalculatorGUI.calc.push_number(Double.parseDouble(output_tf.getText()), Operator.DIVIDE);
		CalculatorGUI.awaiting_operator = false;
	}
    }

    @FXML
    void input_equal(ActionEvent event) {
	if(CalculatorGUI.awaiting_operator) {
		CalculatorGUI.calc.push_number(Double.parseDouble(output_tf.getText()), null);
		String f = CalculatorGUI.calc.calculate() + "";
		output_tf.setText(f);
		output_tf.setAlignment(Pos.CENTER_LEFT);
		CalculatorGUI.awaiting_operator = false;
	}
    }

    @FXML
    void input_multiply(ActionEvent event) {
	if(CalculatorGUI.awaiting_operator) {
		CalculatorGUI.calc.push_number(Double.parseDouble(output_tf.getText()), Operator.MULTIPLY);
		CalculatorGUI.awaiting_operator = false;
	}
    }

    @FXML
    void input_negative(ActionEvent event) {
	if(!output_tf.getText().isEmpty()) {
	    if(output_tf.getText().charAt(0) != '-') {
		output_tf.setText("-" + output_tf.getText());
	    }else {
		output_tf.setText(output_tf.getText().substring(1));
	    }
	}
    }

    @FXML
    void input_subtract(ActionEvent event) {
	if(CalculatorGUI.awaiting_operator) {
		CalculatorGUI.calc.push_number(Double.parseDouble(output_tf.getText()), Operator.SUBTRACT);
		CalculatorGUI.awaiting_operator = false;
	}
    }

}
