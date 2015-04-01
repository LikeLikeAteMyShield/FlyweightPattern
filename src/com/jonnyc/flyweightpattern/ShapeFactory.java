package com.jonnyc.flyweightpattern;

import com.jonnyc.flyweightpattern.model.Circle;
import com.jonnyc.flyweightpattern.model.Shape;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color){

        Circle circle = (Circle) circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("--[CREATE]: Circle of color " + color + "--");
        }

        return circle;
    }
}
