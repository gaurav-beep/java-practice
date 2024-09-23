package practice.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
public static void main(String[] args) {
	Deque<String> queue = new ArrayDeque<String>();
	queue.offer("Shailesh");
	queue.offerFirst("Gaurav");
	queue.offerLast("Omkar");
	queue.offerFirst("Saurabh");
	System.out.println("queue : "+queue);
	queue.pollLast();
	System.out.println("after removel : "+queue);
}
}
