package chapter4;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main4_6_1 {


	Queue<Integer> queue = new ArrayBlockingQueue<>(10);
	queue.offer(1);
	queue.offer(3);
	System.out.println(queue.poll());

	queue.offer(4);
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	queue.offer(6);
	queue.offer(8);
	System.out.println(queue.poll());
	System.out.println(queue.poll());

}
