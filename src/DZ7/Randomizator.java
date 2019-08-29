package DZ7;

import java.util.*;

public final class Randomizator {

    public static void randomClientListWhithOneQuestion(int count) {
        for (int i = 0; i < count; i++) {
            Client client = new Client(WorkLists.getNextClientId(), QuestionType.TYPE_1, null);
            WorkLists.clientQueue.add(client);
        }
    }

    public static void randomOperatorListWhithOneQuestion(int count) {
        for (int i = 0; i < count; i++) {
            Operator operator = new Operator();
            operator.setId(WorkLists.getNextOperatorId());
            operator.setFree(true);
            operator.setOperatorInfo(null);
            List<QuestionType> qt = new ArrayList<>();
            qt.add(QuestionType.TYPE_1);
            operator.setSupportedQuestionType(qt);
            WorkLists.operatorsList.add(operator);
        }
    }

    public static Client randomClient(Set<QuestionType> questionTypes) {
        Random r = new Random();
        return new Client(WorkLists.getNextClientId(), questionTypes.toArray(new QuestionType[questionTypes.size()])[r.nextInt(questionTypes.size())], null);
    }

    public static Operator randomOperator() {
        Random r = new Random();
        Operator operator = new Operator();
        operator.setId(WorkLists.getNextOperatorId());
        List<QuestionType> questionList = new ArrayList<>();
        for (int i = 0; i < r.nextInt(QuestionType.values().length); i++) {
            QuestionType qt = QuestionType.values()[r.nextInt(QuestionType.values().length)];
            if (!questionList.contains(qt)) questionList.add(qt);
            //questionList.add((QuestionType) QuestionType.values()[i]);
        }
        operator.setSupportedQuestionType(questionList);
        operator.setOperatorInfo(null);
        operator.setFree(true);
        return operator;
    }

    public static void randomClientList(int clientCount) {
        Set<QuestionType> questionTypes = new HashSet<>();
        for (Operator o : WorkLists.operatorsList) {
            questionTypes.addAll(o.getSupportedQuestionType());
        }
        while (clientCount > 0) {
            WorkLists.clientQueue.add(randomClient(questionTypes));
            clientCount--;
        }
    }

    public static void randomOperatorList(int operatorsCount) {
        while (operatorsCount > 0) {
            WorkLists.operatorsList.add(randomOperator());
            operatorsCount--;
        }
    }

}
