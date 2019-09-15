package DZ8_StreamsAndPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsStatistic implements ChainOfTextStatistics {
    private ChainOfTextStatistics nextInChainOfTextStatistics;

    @Override
    public void setNext(ChainOfTextStatistics nextInChainOfTextStatistics) {
        this.nextInChainOfTextStatistics = nextInChainOfTextStatistics;
    }

    @Override
    public void calculate(List<String> stringList) {
        List<String> wordsList = new ArrayList<>();
        int wordsCounter = 0;
        for (String s : stringList) {
            String[] splittedWord = s.split(" ");
            wordsCounter += splittedWord.length;
            wordsList.addAll(Arrays.asList(splittedWord));
        }
        Statistic.word = wordsCounter;
    }
}
