package DZ8_StreamsAndPatterns;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
    static Path path = Paths.get("./src/DZ8_StreamsAndPatterns/resources/TextForOriginalIntArray");
    static Path path2 = Paths.get("./src/DZ8_StreamsAndPatterns/resources/TextForSortedIntArray");
    static Path path3 = Paths.get("./src/DZ8_StreamsAndPatterns/resources/OriginalTextForReplacement");
    static Path path4 = Paths.get("./src/DZ8_StreamsAndPatterns/resources/EditedTextForReplacement");
    static Path pathForStatistic = Paths.get("./src/DZ8_StreamsAndPatterns/resources/TextForStatistic");


    public static void main(String[] args) {
        //Z1
        {
            List<Integer> intList = Supply.generateRandomIntArray(100);
            Supply.writeIntList(intList, path);
            intList = Supply.readIntList(path);
            Collections.sort(intList);
            Supply.writeIntList(intList, path2);
        }
        //Z2
        {
            List<String> stringListForReplacement = Supply.readStringData(path3);
            ListIterator<String> stringListIterator = stringListForReplacement.listIterator();
            while (stringListIterator.hasNext()) {
                String tmpString = stringListIterator.next();
                tmpString = Supply.replaseSubstrings(tmpString);
                stringListIterator.set(tmpString);
            }
            Supply.writeStringData(stringListForReplacement, path4);
        }
        //Z3
        {
            ChainOfTextStatistics chainParagraph = new ParagraphStatistic();
            ChainOfTextStatistics chainSentence = new SentenceStatistic();
            ChainOfTextStatistics chainWord = new WordsStatistic();
            chainParagraph.setNext(chainSentence);
            chainSentence.setNext(chainWord);
            List<String> stringListForStatistics = Supply.readStringData(pathForStatistic);
            chainParagraph.calculate(stringListForStatistics);
            System.out.println("******* Text Statistic *******" + "\n" +
                    "Paragraphs " + Statistic.paragraph + "\n" +
                    "Sentences " + Statistic.sentence + "\n" +
                    "Words " + Statistic.word);
        }
    }

}
