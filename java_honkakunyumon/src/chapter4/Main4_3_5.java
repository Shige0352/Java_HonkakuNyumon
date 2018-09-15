package chapter4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main4_3_5 {
	
	List<Integer> values = Arrays.asList(1, 1, 4, 5, 7, 8, 11, 12, 17, 21, 24);
	int dound = Collections.binarySearch(values, 5);
	System.out.println(foud);
	
	int notFound = Collections.binarySearch(values, 6);
	System.out.println(notFound);
}
