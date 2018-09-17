package chapter5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main5_6_1 {

	List<Integer> integerlist = IntStream.of(1, 62, 31, 54, 31).boxed()
			.collect(Collectors.toList());

	List<String> stringList = Stream.of("Takuya", "Shin", "Stoshi").collect(Collectors.
			toList());

}
