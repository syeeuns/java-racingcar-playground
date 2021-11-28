package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import utils.RandomUtil;

public class CarTest {

  @ParameterizedTest
  @ValueSource(ints = {0, 1, 2, 3})
  void notMove(int number) {
    Car car = new Car("1");
    car.move(number);
    assertThat(car.getPosition()).isEqualTo(0);
  }

  @ParameterizedTest
  @ValueSource(ints = {4, 5, 6, 7, 8, 9})
  void move(int number) {
    Car car = new Car("1");
    car.move(number);
    assertThat(car.getPosition()).isEqualTo(1);
  }
}
