package com.foxin.state_pattern;

public class HandlerClass {

    public AbstractState currentState;

    public HandlerClass(AbstractState abstractState){
        this.currentState = abstractState;
    }

    public void toggleState(){
        if (currentState instanceof StateOne){
            currentState = new StateTwo();
        }
        else if (currentState instanceof  StateTwo){
            currentState = new StateThree();
        }
    }
}
