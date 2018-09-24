package chapter10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main10_4_1 {

	List<Integer> list = new ArrayList<>();
	List.add(1);
	List.add(2);
	List.add(100);
	System.out.println(list);

	List<Integer> list2 = new LinkedList<>();
	List2.add(1);
	List2.add(2);
	List2.add(100);
	System.out.println(list);




	List<Integer> list3 = new LinkedList<>();
	List3.add(2);
	List3.add(1);
	if (list3 Instanceof LinkedList) {
		((LinkedList<Integer>)list).addLast(10);
	}
	System.out.println(list3);

}
