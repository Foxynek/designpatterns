package com.foxin.factory_pattern;

public class Basketball implements BallFactory {

    public Ball createBall(){
        Ball basketball = new Ball();
        basketball.type = "Outdoor";
        basketball.brand = "Adidas";
        basketball.model = "World Cup Basket";
        return basketball;
    }
}
