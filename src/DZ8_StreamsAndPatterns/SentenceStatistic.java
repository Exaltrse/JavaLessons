package DZ8_StreamsAndPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceStatistic implements ChainOfTextStatistics {
    private ChainOfTextStatistics nextInChainOfTextStatistics;

    @Override
    public void setNext(ChainOfTextStatistics nextInChainOfTextStatistics) {
        this.nextInChainOfTextStatistics = nextInChainOfTextStatistics;
    }

    @Override
    public void calculate(List<String> stringList) {
        //Extremely primitive partition. It works only on very simple texts in English and Russian.
        // It does not take into account many special cases, such as the abbreviation followed by a nominal noun, etc.
        int sentenceCounter = 0;
        List<String> sentenceStringList = new ArrayList<>();
        for (String s : stringList) {
            String[] splittedStringArrayForSentence = s.split("[.!?] [A-ZА-ЯЁ]");
            sentenceCounter += splittedStringArrayForSentence.length;
            if (splittedStringArrayForSentence.length <= 1) {
                sentenceStringList.addAll(Arrays.asList(splittedStringArrayForSentence));
                continue;
            }
            String tmpString = s.toString();
            for (String sub : splittedStringArrayForSentence) {
                tmpString = tmpString.replaceAll(sub, "/u0963");
            }
            String[] tmpStringArray = tmpString.split("/u0963");
            for (int i = 0; i < splittedStringArrayForSentence.length; i++) {
                if (i != (splittedStringArrayForSentence.length - 1)) {
                    Character lastCharacter = tmpStringArray[i + 1].charAt(0);
                    splittedStringArrayForSentence[i] += lastCharacter;
                }
                if (i == 0) continue;
                Character firstCharacter = tmpStringArray[i].charAt(tmpStringArray[i].length() - 1);
                splittedStringArrayForSentence[i] = firstCharacter + splittedStringArrayForSentence[i];
            }
            sentenceStringList.addAll(Arrays.asList(splittedStringArrayForSentence));
        }
        Statistic.sentence = sentenceCounter;
        nextInChainOfTextStatistics.calculate(stringList);
    }
}
