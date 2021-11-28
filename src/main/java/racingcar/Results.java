package racingcar;

import java.util.List;

public class Results {

  List<Result> results;

  public List<Result> getResults() {
    return results;
  }

  public Results(List<Result> resultList) {
    this.results = resultList;
  }

  public String getWinners(Results gameResults) {
    return gameResults.getResults().get(results.size() - 1).findWinners();
  }
}
