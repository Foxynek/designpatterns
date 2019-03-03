package com.foxin.facade_pattern;

public class Facade {

    Turn turn = new Turn();
    Engine engine = new Engine();

    public void startIgnition(){
        engine.startIgnition();
    }
    public void startMoving(){
        engine.startMoving();
    }
    public void turnLeft(){
        turn.turnLeft();
    }
    public void turnRight(){
        turn.turnRight();
    }
}
