package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarsTest {

  @Test
  void makeCarsString() {
    Cars cars = new Cars("a,b,c");
    assertThat(cars.getCars().size()).isEqualTo(3);
  }
}
