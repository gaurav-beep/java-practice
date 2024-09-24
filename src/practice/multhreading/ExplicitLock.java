package practice.multhreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplicitLock extends Thread {
	private static final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        performTask();
    }

    public void performTask() {
        // Manually acquiring the lock
        lock.lock();
        try {
            // Critical section (protected by the lock)
            System.out.println(Thread.currentThread().getName() + " acquired the lock and is performing the task");

            // Simulate some work
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } finally {
            // Manually releasing the lock (important to do in `finally` to avoid lock leakage)
            System.out.println(Thread.currentThread().getName() + " is releasing the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
		ExplicitLock thread1 = new ExplicitLock();
		ExplicitLock thread2 = new ExplicitLock();

		thread1.start();
		thread2.start();
    }
}
