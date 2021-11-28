package view;

import java.util.Scanner;
import racingcar.Cars;

public class Inputview {

  private static final Inputview INPUT_VIEW = new Inputview();
  private static final Scanner sc = new Scanner(System.in);

  private Inputview() {
  }

  public static Inputview getInstance() {
    return INPUT_VIEW;
  }

  public int input() {
    return sc.nextInt();
  }

  public void countInput() {
    System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
  }

  public void timesInput() {
    System.out.println("시도할 회수는 몇회인가요?");
  }
}
