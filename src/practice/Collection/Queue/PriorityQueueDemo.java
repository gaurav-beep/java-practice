package practice.Collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
public static void main(String[] args) {
	PriorityQueue<Integer> queue = new PriorityQueue<>();
	queue.add(23);
	queue.add(15);
	queue.add(42);
	queue.add(1);
	System.out.println("queue : "+queue);
}
}
