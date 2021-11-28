package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

  private List<Car> cars;

  public List<Car> getCars() {
    return cars;
  }

  public Cars(int count) {
    this.cars = makeCars(count);
  }

  public Cars(List<Car> cars) {
    this.cars = cars;
  }

  public static List<Car> makeCars(int count) {
    List<Car> cars = new ArrayList<>();

    for (int i = 1; i <= count; i++) {
      cars.add(new Car(String.valueOf(i)));
    }
    return cars;
  }
}
