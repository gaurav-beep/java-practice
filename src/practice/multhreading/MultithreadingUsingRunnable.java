package practice.multhreading;

import java.util.Arrays;
import java.util.List;

public class MultithreadingUsingRunnable implements Runnable {
    static Integer sum = 0;
    List<Integer> list;

    MultithreadingUsingRunnable(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        list.stream().forEach(element -> {
            // Synchronize the block to avoid race condition
            synchronized (MultithreadingUsingRunnable.class) {
                sum += element;
                System.out.println("Added--->" + element + " : " + sum);
            }
        });
    }

    public static void main(String[] args) {
        // Record the start time
        long startTime = System.currentTimeMillis();

        Integer[] arr = {12, 34, 23, 67, 36, 48, 97, 65,13,456,432,765,234};
        List<Integer> list = Arrays.asList(arr);

        // First half of the list
        MultithreadingUsingRunnable obj1 = new MultithreadingUsingRunnable(list.subList(0, list.size() / 2));
        Thread t1 = new Thread(obj1);

        // Second half of the list
        MultithreadingUsingRunnable obj2 = new MultithreadingUsingRunnable(list.subList(list.size() / 2, list.size()));
        Thread t2 = new Thread(obj2);

        // Start the threads
        t1.start();
        t2.start();

        // Wait for both threads to complete using join()
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Record the end time
        long endTime = System.currentTimeMillis();

        // Display the total sum and the time taken
        System.out.println("Total sum: " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
