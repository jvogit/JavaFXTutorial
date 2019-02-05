package com.gmail.justinxvopro.JavaFXTutorial;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ButtonEventHandler implements EventHandler<ActionEvent> {
    
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Hello, World!");
    }
    
}
