package DZ8_StreamsAndPatterns;

import java.util.List;

public class ParagraphStatistic implements ChainOfTextStatistics {
    private ChainOfTextStatistics nextInChainOfTextStatistics;

    @Override
    public void setNext(ChainOfTextStatistics nextInChainOfTextStatistics) {
        this.nextInChainOfTextStatistics = nextInChainOfTextStatistics;
    }

    @Override
    public void calculate(List<String> stringList) {
        if (stringList == null) return;
        if (stringList.size() < 1) return;
        Statistic.paragraph = stringList.size();
        nextInChainOfTextStatistics.calculate(stringList);
    }
}
