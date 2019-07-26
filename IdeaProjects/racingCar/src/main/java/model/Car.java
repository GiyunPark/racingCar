package model;

public class Car {

    private String carName;

    private String position;

    public Car(String carName){
        this.carName=carName;
    }
    public static Car withCarName(String carName){
        return new Car(carName);
    }

    public void move(){

    }

}
