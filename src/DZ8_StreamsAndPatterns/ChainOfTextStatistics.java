package DZ8_StreamsAndPatterns;

import java.util.List;

public interface ChainOfTextStatistics {
    public abstract void setNext(ChainOfTextStatistics nextInChainOfTextStatistics);

    public abstract void calculate(List<String> stringList);
}
