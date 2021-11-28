import racingcar.Controller;
import racingcar.Results;
import view.Inputview;
import view.OutputView;

public class RacingCarApplication {

  public static void main(String[] args) {
    Controller controller = Controller.getInstance();
    Inputview inputview = Inputview.getInstance();
    OutputView outputView = OutputView.getInstance();

    inputview.countInput();
    String input = inputview.stringInput();

    inputview.timesInput();
    int times = inputview.input();

    Results results = controller.play(input, times);

    outputView.printResults(results);
  }
}
