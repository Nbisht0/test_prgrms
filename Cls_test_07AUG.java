import java.io.*;

public class Cls_test_07AUG {

    public static void main(String[] args) throws InterruptedException {

        //---------q1. CREATE A THREAD TO SHOW THE DIFFERENCE BETWEEN SYNCHRONIZATION AND ASYNCHRONISATION----------------------------

//        Counter asyncCounter = new Counter();
//        Counter syncCounter = new Counter();
//
//
//        Thread asyncThread1 = new AsyncThread(asyncCounter);
//        Thread asyncThread2 = new AsyncThread(asyncCounter);
//
//        asyncThread1.start();
//        asyncThread2.start();
//        asyncThread1.join();
//        asyncThread2.join();
//
//        System.out.println("Asynchronous Counter (Expected: 2000): " + asyncCounter.count);
//
//
//        Thread syncThread1 = new SyncThread(syncCounter);
//        Thread syncThread2 = new SyncThread(syncCounter);
//
//        syncThread1.start();
//        syncThread2.start();
//        syncThread1.join();
//        syncThread2.join();
//
//        System.out.println("Synchronous Counter (Expected: 2000): " + syncCounter.count);



        //----------------q2.CREATE A TEXT FILE USING BUFFER READER AND THE INPUT OF THE DATA--------------------

        try {
            // Reader to take input from user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Writer to write to a file
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            System.out.println("Enter text to save in file (type 'exit' to finish):");

            String line;
            while (true) {
                System.out.print("> ");
                line = reader.readLine();


                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(line);
                writer.newLine(); // Adds a new line after each input
            }
            writer.close();
            reader.close();

            System.out.println("Data has been written to 'output.txt'.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


    }
}
class Counter {
    int count = 0;

    // Unsynchronized method
    public void incrementAsync() {
        count++;
    }

    // Synchronized method
    public synchronized void incrementSync() {
        count++;
    }
}

class AsyncThread extends Thread {
    Counter counter;

    public AsyncThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementAsync();
        }
    }
}

class SyncThread extends Thread {
    Counter counter;

    public SyncThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementSync();
        }
    }
}

