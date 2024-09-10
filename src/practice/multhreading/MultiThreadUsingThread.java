package practice.multhreading;

public class MultiThreadUsingThread extends Thread {
    private String threadName;
    private int sleepTimer;
    private int start=1;
    private int end=10;

    public MultiThreadUsingThread(String threadName,int sleepTimer,int start,int end) {
        this.threadName = threadName;
        this.sleepTimer = sleepTimer;
        this.start = start;
        this.end = end;
    }
    
    public MultiThreadUsingThread() {};

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
        	try {
                Thread.sleep(sleepTimer); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Print statement should be outside of the sleep condition
            System.out.println(threadName + ": " + i);
        }
    }

    public static void main(String[] args) {
    	MultiThreadUsingThread obj = new MultiThreadUsingThread();
    	int mid = (obj.start+obj.end)/2;
        MultiThreadUsingThread t1 = new MultiThreadUsingThread("Gaurav", 2000,obj.start,mid);
        MultiThreadUsingThread t2 = new MultiThreadUsingThread("Omkar", 1000,mid+1,obj.end);
        
        t2.start();
        t1.start();
    }
}
