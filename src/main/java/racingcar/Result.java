package racingcar;

public class Result {

  private final Cars cars;

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
}
