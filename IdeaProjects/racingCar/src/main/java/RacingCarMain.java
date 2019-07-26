import view.InputView;

public class RacingCarMain {

    public static void main(String[] args){
        InputView inputView = new InputView();
        String[] numOfCars = inputView.inputNumOfCar();
        int numOfTry = inputView.inputNumOfTry();
    }
}
