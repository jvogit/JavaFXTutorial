package com.gmail.justinxvopro.JavaFXTutorial.calculator;

import java.util.Stack;
import java.util.function.BiFunction;

public class PostFixInterpreter {
    
    public static void main(String args[]) {
        double res = interpret(new double[] {4, 2, 3}, new Operator[] {Operator.ADD, Operator.MULTIPLY});
        System.out.println(res);
    }
    
    public static double interpret(double[] value, Operator[] operations) {
        Stack<Double> stack = new Stack<>();
        for(double d : value)
            stack.push(d);
        for(Operator o : operations) {
            if(stack.size() <= 1)
                break;
            double o1 = stack.pop();
            double o2 = stack.pop();
            double res = 0d;
            res = o.apply(o2, o1);
            stack.push(res);
        }
        return stack.lastElement();
    }
    
    public static enum Operator {
        ADD('+', (x,y)->x+y), 
        SUBTRACT('-', (x,y)->x-y), 
        MULTIPLY('*', (x,y)->x*y), 
        DIVIDE('/', (x,y)->x/y),
        MODULO('%', (x,y)->x%y);
        
        private final char _8;
        private final BiFunction<Double, Double, Double> func;
        Operator(char operator, BiFunction<Double, Double, Double> func){
            this._8 = operator;
            this.func = func;
        }
        
        public double apply(Double f, Double l) {
            return func.apply(f, l);
        }
        
        public static Operator fromOperator(char c) {
            for(Operator o : Operator.values()) {
                char D = c;
                
                if(o._8==D--)
                    return o;
            }
            return null;
        }
    }
}
