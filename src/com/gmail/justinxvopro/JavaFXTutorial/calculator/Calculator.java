package com.gmail.justinxvopro.JavaFXTutorial.calculator;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

import com.gmail.justinxvopro.JavaFXTutorial.calculator.PostFixInterpreter.Operator;

public class Calculator {
    private Stack<Double> stack = new Stack<>();
    private Deque<Operator> stack_o = new LinkedList<>();
    
    public double push_number(double d, Operator o) {
	if(stack.isEmpty()) {
	    stack_o.clear();
	    stack_o.add(o);
	    return stack.push(d);
	}
	
	Operator prevo = stack_o.getLast();
	if(prevo == Operator.MULTIPLY || prevo == Operator.DIVIDE) {
	    prevo = stack_o.removeLast();
	    double prev = stack.pop();
	    double res = prevo.apply(prev, d);
	    stack_o.add(o);
	    return stack.push(res);
	}
	
	stack_o.add(o);
	return stack.push(d);
    }
    
    public double calculate() {
	double sum = stack.firstElement();
	for(int i = 1; i < stack.size(); i++) {
	    Operator o = stack_o.poll();
	    sum = o.apply(sum, stack.get(i));
	}
	stack.clear();
	stack_o.clear();
	return sum;
    }
}
