package com.foxin.state_pattern;

public class StateOne extends AbstractState {

    String field = "one";

    public void procedure(){
        super.procedure();
        System.out.println(field);
    }
}
