package model;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingCarFactoryTest {

    @Test
    @DisplayName("입력한 만큼 자동차 객체를 생성하는지 테스트")
    public void carFactory() {
        String[] carsName = {"아우디", "벤츠", "소나타"};
        RacingCarFactory racingCarFactory = new RacingCarFactory();
        RacingCars racingCars = racingCarFactory.CarFactory(carsName);

        assertEquals(3, racingCars.getCarList().size());
        assertThat(racingCars.getCarList().size()).isEqualTo(3);
    }
}
