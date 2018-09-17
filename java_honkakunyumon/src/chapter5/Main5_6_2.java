package chapter5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main5_6_2 {

	List<Integer> integerList = IntStream.range(1, 100).boxed()
			.collect(Collectors.toList());


	List<Integer> integerList = IntStream.rangeClosed(1, 100).boxed()
			.collect(Collectors.toList());


}
