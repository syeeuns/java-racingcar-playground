package utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomUtilTest {

  @Test
  void generateRandomNumber() {
    int result = RandomUtil.generateRandomNumber();
    assertThat(result).isGreaterThan(-1);
    assertThat(result).isLessThan(10);
  }
}
