package com.foxin.factory_pattern;

import java.util.ArrayList;

public class Football implements BallFactory {

    public Ball createBall(){
        Ball ball = new Ball();
        ball.brand = "Nike";
        ball.model = "Titan00";
        ball.type = "Football";
        ball.materials = new ArrayList<String>();
        ball.materials.add("Wood");
        ball.materials.add("Plastic");
        return ball;
    }
}
