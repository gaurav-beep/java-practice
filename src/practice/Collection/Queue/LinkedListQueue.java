package practice.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
public static void main(String[] args) {
	Queue<String> queue = new LinkedList<String>();
	queue.offer("Gaurav");
	queue.add("Omkar");
	queue.offer("Shailesh");
	queue.add("Saurabh");
	System.out.println("queue : "+queue);
	System.out.println("peek : "+queue.peek());
	queue.poll();
	System.out.println("queue after removal : "+queue);
	System.out.println("peek : "+queue.peek());
}
}
