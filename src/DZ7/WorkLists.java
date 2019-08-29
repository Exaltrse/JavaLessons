package DZ7;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public final class WorkLists {
    private volatile static Long clientId = 0L;
    private volatile static Long operatorId = 0L;

    public static volatile Deque<Client> clientQueue;
    public static volatile List<Operator> operatorsList;
    public static volatile Deque<Client> buferClientStack;

    static {
        clientQueue = new LinkedList<>();
        operatorsList = new ArrayList<>();
        buferClientStack = new LinkedList<>();
    }

    public static Long getClientId() {
        return clientId;
    }

    public static Long getNextClientId() {
        return ++clientId;
    }

    public static Long getOperatorId() {
        return operatorId;
    }

    public static Long getNextOperatorId() {
        return ++operatorId;
    }

    public static boolean hasFreeOperator() {
        for (Operator o : operatorsList) {
            if (o.getFree()) return true;
        }
        return false;
    }

    public static boolean hasFreeCompetentOperator(QuestionType questionType) {
        for (Operator o : operatorsList) {
            if (!o.getFree()) continue;
            if (o.isCompetent(questionType)) return true;
        }
        return false;
    }

    public static Operator getCompetentOperator(QuestionType questionType) {
        for (Operator o : operatorsList) {
            if (!o.getFree()) continue;
            if (o.isCompetent(questionType)) return o;
        }
        return null;
    }

    public static void disableAllOperatorsWhithQuestion(QuestionType questionType) {
        for (Operator operator : operatorsList) {
            if (operator.isCompetent(questionType)) {
                operator.setFree(false);
            }
        }
    }

}
