package chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main4_3_4 {

	List<Integer> list = new ArrayList<>();

	List.add(3);
	List.add(1);
	List.add(13);
	List.add(2);

	Comparator<Integer> comparator = new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2.conpareTo(o1);
		}
	};

	Collections.sort(list, c);
	System.out.println(list);
}


