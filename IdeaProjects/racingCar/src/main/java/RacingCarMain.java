import model.RacingCarFactory;
import model.RacingCars;
import model.RacingGameManager;
import view.InputView;
import view.ResultView;

public class RacingCarMain {

    public static void main(String[] args){
        InputView inputView = new InputView();
        String[] nameOfCars = inputView.inputNumOfCar();
        int numOfTry = inputView.inputNumOfTry();

        RacingCarFactory racingCarFactory = new RacingCarFactory();
        RacingGameManager racingGameManager = new RacingGameManager();

        RacingCars racingCars = racingCarFactory.CarFactory(nameOfCars);
        ResultView resultView = new ResultView();

        for(int tryCount=0; tryCount<numOfTry; tryCount++){
            racingGameManager.singleGame(racingCars);
            resultView.showCurrentResult(racingCars);
            System.out.println();
        }
    }
}
