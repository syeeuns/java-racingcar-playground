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
    int count = inputview.input();

    inputview.timesInput();
    int times = inputview.input();

    Results results = controller.play(count, times);

    outputView.printResults(results);
  }
}
