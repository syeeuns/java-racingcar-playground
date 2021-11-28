package view;

import racingcar.Result;
import racingcar.Results;

public class OutputView {

  private static final OutputView OUTPUT_VIEW = new OutputView();

  private OutputView() {
  }

  public static OutputView getInstance() {
    return OUTPUT_VIEW;
  }

  public void printResults(Results results) {
    results.getResults().forEach(Result::printResult);
    System.out.println(results.getWinners(results) + "가 최종 우승했습니다.");
  }
}
