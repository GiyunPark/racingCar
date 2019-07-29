package view;

import model.Car;
import model.RacingCars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ResultView {

    public void showCurrentResult(RacingCars racingCars) {
        for (Car car : racingCars.getCarList()) {
            int position = car.getPosition();
            String result = IntStream.range(0, position).mapToObj(i -> "-").collect(Collectors.joining());
            System.out.println(car.getCarName() + " : " + result);
        }
    }

}
