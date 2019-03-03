package com.foxin.state_pattern;

public class StateThree extends AbstractState {

    String field = "three";

    public void procedure(){
        System.out.println("No procedure from super called: " + field);
    }
}
