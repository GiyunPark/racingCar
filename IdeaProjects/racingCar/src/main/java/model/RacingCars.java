package model;

import java.util.List;

public class RacingCars {

    private List<Car> carList;

    public RacingCars(List<Car> carList){
        this.carList=carList;
    }
    public List<Car> getCarList(){
        return this.carList;
    }
}
