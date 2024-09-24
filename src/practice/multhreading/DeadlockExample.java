package practice.multhreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            lock1.lock();
            System.out.println("Thread-1 acquired lock1");

            try {
                Thread.sleep(100); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread-1 waiting for lock2");
            lock2.lock();
            System.out.println("Thread-1 acquired lock2");

            lock2.unlock();
            lock1.unlock();
        });

        Thread t2 = new Thread(() -> {
            lock2.lock();
            System.out.println("Thread-2 acquired lock2");

            try {
                Thread.sleep(100); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread-2 waiting for lock1");
            lock1.lock();
            System.out.println("Thread-2 acquired lock1");

            lock1.unlock();
            lock2.unlock();
        });

        t1.start();
        t2.start();
    }
}

