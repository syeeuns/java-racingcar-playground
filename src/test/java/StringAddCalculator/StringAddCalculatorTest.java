package StringAddCalculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class StringAddCalculatorTest {

  @Test
  void splitAndSum_null_or_empty() {
    int result = StringAddCalculator.splitAndSum(null);
    assertThat(result).isEqualTo(0);

    result = StringAddCalculator.splitAndSum("");
    assertThat(result).isEqualTo(0);
  }

  @Test
  void splitAndSum_one_number() throws Exception {
    int result = StringAddCalculator.splitAndSum("1");
    assertThat(result).isEqualTo(1);
  }

  @Test
  void splitAndSum_comma() throws Exception {
    int result = StringAddCalculator.splitAndSum("1,2,3");
    assertThat(result).isEqualTo(6);
  }

  @Test
  void splitAndSum_comma_or_colon() throws Exception {
    int result = StringAddCalculator.splitAndSum("1,2:3");
    assertThat(result).isEqualTo(6);
  }

  @Test
  void splitAndSum_custom() throws Exception {
    int result = StringAddCalculator.splitAndSum("//;\n1;2;3");
    assertThat(result).isEqualTo(6);
  }

  @Test
  void splitAndSum_negative() throws Exception {
    assertThatThrownBy(() -> StringAddCalculator.splitAndSum("-1,2,3"))
        .isInstanceOf(RuntimeException.class);
  }
}
