package chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main4_3_2 {

	List<Integer> list = new List<>();

	list.add(1);
	list.add(61);
	list.add(31);
	list.add(54);
	list.add(31);

	List<Integer> integerList = Arrays.asList(1, 62, 31, 1, 54, 31);

	List<Integer> integerList = new ArrayList<>(Array.asList(1, 62, 31, 54, 31));
}
