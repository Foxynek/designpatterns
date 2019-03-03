package com.foxin.facade_pattern;

public class Turn {

    Wheel wheel = new Wheel();
    SteeringWheel steeringWheel = new SteeringWheel();

    public void turnLeft(){
        steeringWheel.turnLeft();
        wheel.turnLeft();
        System.out.println("Turning Left");
    }

    public void turnRight(){
        steeringWheel.turnRight();
        wheel.turnRight();
        System.out.println("Turning Right");
    }
}
