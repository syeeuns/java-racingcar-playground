package racingcar;

import java.util.ArrayList;
import java.util.List;
import utils.RandomUtil;

public class Controller {

  private static final Controller CONTROLLER = new Controller();

  private Controller() {
  }

  public static Controller getInstance() {
    return CONTROLLER;
  }

  public Results play(String input, int times) {
    Cars cars = new Cars(input);
    List<Result> resultList = new ArrayList<>();

    for (int i = 0; i < times; i++) {
      resultList.add(playOneRound(cars));
    }
    return new Results(resultList);
  }

  private Result playOneRound(Cars cars) {
    List<Car> newCars = new ArrayList<>();
    for (Car car : cars.getCars()) {
      newCars.add(car.move(RandomUtil.generateRandomNumber()));
    }
    return new Result(new Cars(newCars));
  }
}
