package chapter4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main4_5_1 {
	Set<Integer> integerSet = new HashSet<>();

	Set<Integer> integerList = new HashSet<>(integerList);

	List<Integer> IntegerList = Arrays.asList(1, 62, 31, 54, 31);
	System.out.println("List :" + integerList);

	Set<Integer> integerSet = new HashSet<>(integerList);


	int[] integerArray = new int[] {1, 62,31, 1, 54, 31 };
	List<Integer> integerList = Arrays.asList(integerArray);
	Set<Integer> integerSet = new HashSet<>(integerList);
}

