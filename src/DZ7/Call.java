package DZ7;

import DZ7.Stubs.Logging;

import java.util.Random;

public class Call implements Runnable {
    private Client client;
    private Operator operator;

    public Call(Client client, Operator operator) {
        this.client = client;
        this.operator = operator;
        operator.setFree(false);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public void run() {
        Random r = new Random();
        int callDuration = r.nextInt(1000000) / 20;
        try {

            Thread.sleep(callDuration);
        } catch (InterruptedException e) {

        }
        Logging.toLog(this.client, this.operator, callDuration);
        operator.setFree(true);
    }
}
