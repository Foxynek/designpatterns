package com.foxin.factory_pattern;

import java.util.ArrayList;

public class Floorball implements BallFactory {

    public Ball createBall(){
        Ball floorball = new Ball();
        floorball.type = "Floorball";
        floorball.materials = new ArrayList<String>();
        floorball.materials.add("Plastic");
        floorball.materials.add("Silicon");
        floorball.materials.add("Iron");
        floorball.model = "Champion Series 10";
        floorball.brand = "Foxin Ball";
        floorball.radius = 59.44489F;
        floorball.comments = "Signed by Will Willy";
        return floorball;
    }
}
