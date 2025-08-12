import java.util.concurrent.locks.*;
import java.util.concurrent.*;
import java.util.function.Predicate;



public class Cls_test_12Aug {
    static Lock lock = new ReentrantLock();    //part of q3
    static Condition notEmpty = lock.newCondition();
    static int buffer = 0;


    public static void main(String[] args) throws Exception  {


        //--------------------Q1----------------------------------
         Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " → State: RUNNING");
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " → Count: " + i);
                try {
                    Thread.sleep(500); // simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " → State: TERMINATED");
        };


        Thread thread1 = new Thread(task, "Worker-1");
        Thread thread2 = new Thread(task, "Worker-2");


        thread1.setPriority(Thread.MIN_PRIORITY); // 1
        thread2.setPriority(Thread.MAX_PRIORITY); // 10

        System.out.println(thread1.getName() + " created → State: " + thread1.getState());
        System.out.println(thread2.getName() + " created → State: " + thread2.getState());


        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon Thread running in background...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }, "Helper-Daemon");
        daemonThread.setDaemon(true); // mark as daemon
        daemonThread.start();


        thread1.start();
        thread2.start();

        System.out.println(thread1.getName() + " after start → State: " + thread1.getState());
        System.out.println(thread2.getName() + " after start → State: " + thread2.getState());


        thread1.join();
        thread2.join();

        System.out.println(thread1.getName() + " final → State: " + thread1.getState());
        System.out.println(thread2.getName() + " final → State: " + thread2.getState());






        //----------------------Q3--------------------------------

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                lock.lock();
                try {
                    buffer++;
                    System.out.println("Produced: " + buffer);
                    notEmpty.signal();
                } finally { lock.unlock(); }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                lock.lock();
                try {
                    while (buffer == 0) notEmpty.await();
                    System.out.println("Consumed: " + buffer);
                    buffer--;
                } catch (InterruptedException e) {}
                finally { lock.unlock(); }
            }
        });

        producer.start();
        consumer.start();







        //---------------------------------q4 -----------------------------------------------
        //Batch processing :  Sending multiple SQL statements
        // to the database in one go instead of executing them one by one.
        // Batch pooling : reusing a set of pre-created database connections instead of opening
        // a new connection every time your program talks to the database.



        //-----------------q5-------------------------
        Runnable logTransaction = () -> System.out.println("Transaction logged successfully!");
        new Thread(logTransaction).start();

        // Callable: Calculate the account balance (no input, returns value)
        Callable<Double> calculateBalance = () -> {
            double deposit = 1500;
            double withdrawal = 700;
            return deposit - withdrawal; // final balance
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Double> balanceFuture = executor.submit(calculateBalance);

        // Get the balance result from Callable
        double finalBalance = balanceFuture.get();
        System.out.println("Final balance: " + finalBalance);

        // Predicate: Check if balance is above minimum requirement
        Predicate<Double> isBalanceSufficient = balance -> balance >= 500;
        System.out.println("Balance sufficient? " + isBalanceSufficient.test(finalBalance));

        executor.shutdown();
    }
}


























