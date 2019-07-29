package model;

import java.util.Random;

public class Car {

    final static int MINIMUM_NUM_OF_MOVE = 4;

    private String carName;

    private int position;

    public Car(String carName){
        this.carName=carName;
    }

    public int getPosition(){
        return position;
    }

    public String getCarName(){
        return carName;
    }

    public static Car withCarName(String carName){
        return new Car(carName);
    }

    public void move(int gamePoint){
        if(checkMoveRule(gamePoint))
            position++;
    }
    public boolean checkMoveRule(int gamePoint){
        return  MINIMUM_NUM_OF_MOVE<gamePoint;
    }

}
