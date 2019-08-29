package DZ7.Stubs;

import DZ7.Client;
import DZ7.Operator;

import java.time.LocalTime;

public final class Logging {
    //The stub class. Simulates logging by transferring call records to the console.
    public synchronized static void toLog(Client client, Operator operator, int callDuration) {
        LocalTime t = LocalTime.now();
        String s = t.getHour() + ":" + t.getMinute() + ":" + t.getSecond();
        System.out.println(s + " The client id " + client.getId() + " ended the conversation with the operator " +
                operator.getId() + ". Question " + client.getQuestionType() + ". Call duration " + callDuration / 1000 + " s.");
    }
}
