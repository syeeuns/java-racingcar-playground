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
  }
}
