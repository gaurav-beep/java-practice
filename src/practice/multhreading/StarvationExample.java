package practice.multhreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StarvationExample {
    private static final Lock lock = new ReentrantLock(true); // Fair lock

    static class Worker extends Thread {
        public Worker(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (true) {
                try {
                    lock.lock();
                    System.out.println(Thread.currentThread().getName() + " acquired the lock");

                    // Simulate some work with the lock
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(Thread.currentThread().getName() + " releasing the lock");
                    lock.unlock();
                }

                // Allow other threads a chance to acquire the lock
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Worker t1 = new Worker("Thread-1");
        Worker t2 = new Worker("Thread-2");
        Worker t3 = new Worker("Thread-3");

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}


