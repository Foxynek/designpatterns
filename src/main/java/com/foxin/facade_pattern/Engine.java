package com.foxin.facade_pattern;

public class Engine {

    Ignition ignition = new Ignition();
    Pedal pedal = new Pedal();

    void startIgnition(){
        ignition.start();
        System.out.println("Ignition started");
    }

    void startMoving(){
        pedal.push();
        System.out.println("Vehicle is moving");
    }
}
