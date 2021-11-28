package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarsTest {

  @Test
  void makeCars() {
    Cars cars = new Cars(3);
    assertThat(cars.getCars().size()).isEqualTo(3);
  }
}
