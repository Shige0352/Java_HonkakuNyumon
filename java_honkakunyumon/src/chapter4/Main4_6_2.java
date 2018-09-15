package chapter4;

import java.util.Deque;
import java.util.LinkedList;

public class Main4_6_2 {
	Deque<Integer> deque = new LinkedList<>();
	deque.offferFirst(1);
	deque.offferFirst(3);
	deque.offferLast(4);
	System.outprintln(deque.pollFirst());
	deque.offferLast(5);
	System.outprintln(deque.pollFirst());
	System.outprintln(deque.pollFirst());
	System.outprintln(deque.pollFirst());

}
