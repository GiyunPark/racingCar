package view;

import java.util.Scanner;

public class InputView {

    static final String COMMA = ",";

    Scanner scanner = new Scanner(System.in);

    public String[] inputNumOfCar() {
        System.out.println("자동차 이름들을 입력하세요.( , 로 구분지어 입력하세요) ");
        return scanner.nextLine().split(COMMA);
    }

    public int inputNumOfTry() {
        System.out.println("시도할 횟수를 입력하세요.");
        return scanner.nextInt();
    }
}
