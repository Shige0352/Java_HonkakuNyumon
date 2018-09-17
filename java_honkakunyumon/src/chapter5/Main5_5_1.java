package chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main5_5_1 {

	List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");

	List<String> newList = list.stream()
			.filter(p -> p.length() >5)
			.map(p -> "[" + p + "]")
			.collect(Collectors.toList());

	newList.forEach(System.out::println);
}













