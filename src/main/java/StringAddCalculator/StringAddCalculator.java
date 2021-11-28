package stringaddcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

  public static int splitAndSum(String input) {
    if (input == null || input.isEmpty()) {
      return 0;
    }

    Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
    if (m.find()) {
      String customDelimiter = m.group(1);
      String[] tokens = m.group(2).split(customDelimiter);

      return parseTokens(tokens).stream().mapToInt(Integer::intValue).sum();
    }

    String[] tokens = input.split(",|:");
    return parseTokens(tokens).stream().mapToInt(Integer::intValue).sum();
  }

  private static List<Integer> parseTokens(String[] tokens) {
    List<Integer> numbers = new ArrayList<>();

    for (String token : tokens) {
      numbers.add(parseToken(token));
    }
    return numbers;
  }

  private static int parseToken(String token) {
    try {
      int number = Integer.parseInt(token);
      if (number < 0) {
        throw new NumberFormatException();
      }
      return number;
    } catch (NumberFormatException e) {
      throw new RuntimeException("숫자 이외의 값이나 음수는 입력할 수 없습니다.");
    }
  }
}
