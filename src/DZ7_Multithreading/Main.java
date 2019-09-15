package DZ7_Multithreading;

import java.util.LinkedList;
import java.util.List;

public class Main {
    private static List<Thread> threadsList;

    public static void main(String[] args) {
        Randomizator.randomOperatorList(5);
        Randomizator.randomClientList(100);
//        Randomizator.randomOperatorListWhithOneQuestion(20);
//        Randomizator.randomClientListWhithOneQuestion(100);
        System.out.println("-----");
        threadsList = new LinkedList<>();
        while (!WorkLists.clientQueue.isEmpty()) {
            if (WorkLists.hasFreeOperator()) {
                Client tmpClient = WorkLists.clientQueue.removeFirst();
                recursiveCompatibleOperatorSearch(tmpClient);
            } else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
            }
            garbageThreads();
        }
        for (Thread t : threadsList) {
            try {
                t.join();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("End of clients list.");
    }
    //A method of finding a free suitable operator and connecting a client with an operator.
    private static synchronized void recursiveCompatibleOperatorSearch(Client client) {
        if (WorkLists.hasFreeCompetentOperator(client.getQuestionType())) {
            Thread tmpThread = new Thread(new Call(client, WorkLists.getCompetentOperator(client.getQuestionType())));
            tmpThread.start();
            threadsList.add(tmpThread);
        } else {
            WorkLists.buferClientStack.push(client);
            if (WorkLists.clientQueue.isEmpty()) {
                return;
            }
            Client tmpClient = WorkLists.clientQueue.removeFirst();
            recursiveCompatibleOperatorSearch(tmpClient);
        }
        while (!WorkLists.buferClientStack.isEmpty()) {
            WorkLists.clientQueue.push(WorkLists.buferClientStack.pop());
        }
    }
    //Method for clearing a thread pool.
    private static void garbageThreads() {
        List<Thread> bufferForDeadThreads = new LinkedList<>();
        for (Thread t : threadsList) {
            if (!t.isAlive()) {
                bufferForDeadThreads.add(t);
            }
        }
        threadsList.removeAll(bufferForDeadThreads);
    }


}
