package practice.multhreading;

public class IntrinsicLock extends Thread {

    private String name;
    private IntrinsicLock otherLockObject;

    public IntrinsicLock(String name, IntrinsicLock otherLockObject) {
        this.name = name;
        this.otherLockObject = otherLockObject;
    }

    @Override
    public void run() {
        // The thread will call the demo method after a slight delay
        try {
            Thread.sleep(100); // To introduce some delay and simulate concurrency
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        otherLockObject.demo(); // Both threads will call demo() on the same object
    }

    // Synchronized instance method (intrinsic lock on `this`)
    public synchronized void demo() {
        System.out.println(name + " entered demo method");

        // Simulating some work that holds the lock
        try {
            Thread.sleep(2000); // Sleep for 2 seconds to simulate a long task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " exiting demo method");
    }

    public static void main(String[] args) {
        // Creating a single IntrinsicLock instance
        IntrinsicLock lockObject = new IntrinsicLock("SharedLock", null);

        // Pass the same lockObject to both threads
        IntrinsicLock thread1 = new IntrinsicLock("Thread-1", lockObject);
        IntrinsicLock thread2 = new IntrinsicLock("Thread-2", lockObject);

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
