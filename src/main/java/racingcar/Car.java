package racingcar;

public class Car {

  private String name;
  private int position;

  public String getName() {
    return name;
  }

  public int getPosition() {
    return position;
  }

  public Car(String name) {
    this.name = name;
  }

  public Car(String name, int position) {
    this.name = name;
    this.position = position;
  }

  public Car move(int number) {
    if (4 <= number && number < 10) {
      this.position++;
    }
    return new Car(name, position);
  }
}
