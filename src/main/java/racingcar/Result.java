package racingcar;

import java.util.stream.Collectors;

public class Result {

  private final Cars cars;
  private int maximum;

  public Cars getCars() {
    return cars;
  }

  public Result(Cars cars) {
    this.cars = cars;
  }

  public void printResult() {
    for (Car car : cars.getCars()) {
      String load = "-".repeat(car.getPosition());
      System.out.println(car.getName() + " : " + load);
    }
    System.out.println();
  }

  public String findWinners() {
    maximum = cars.getCars().get(0).getPosition();
    for (Car car : cars.getCars()) {
      if (car.getPosition() >= maximum) {
        maximum = car.getPosition();
      }
    }

    return cars.getCars().stream()
        .filter(car -> car.getPosition() == maximum)
        .map(Car::getName)
        .collect(Collectors.joining(","));
  }
}
