package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCarFactory {

    public RacingCars CarFactory(String[] carsName){
        List<Car> carList= Arrays.stream(carsName)
                .map(Car::new)
                .collect(Collectors.toList());
        return RacingCars.withCarList(carList);
    }
}
