package utils;

public class RandomUtil {

  public static int generateRandomNumber() {
    return (int) ((Math.random() * 10000) % 10);
  }
}
