package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

  private List<Car> cars;

  public List<Car> getCars() {
    return cars;
  }

  public Cars(String input) {
    this.cars = makeCars(input);
  }

  public Cars(List<Car> cars) {
    this.cars = cars;
  }

  public static List<Car> makeCars(String input) {
    String[] names = input.split(",");
    List<Car> cars = new ArrayList<>();

    for (String name : names) {
      cars.add(new Car(name));
    }
    return cars;
  }
}
