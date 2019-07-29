package model;

import java.util.Random;

public class RacingRandomPoint {

    public static int getGamePoint() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
