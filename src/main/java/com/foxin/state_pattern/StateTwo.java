package com.foxin.state_pattern;

public class StateTwo extends AbstractState {

    String field = "two";

    public void procedure(){
        super.procedure();
        System.out.println(field);
    }
}
