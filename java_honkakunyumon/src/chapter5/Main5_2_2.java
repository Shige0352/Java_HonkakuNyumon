package chapter5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main5_2_2 {
	String[] array = {"murata", "Okada", "Tanimoto"};
	Stream<String> stream = Arrays.stream(array);
	Stream.forEach(System.out::println);


	Stream<String> stream2.of("murata", "okada", "tanimoto");
	Stream.forEach(System.out::println);
}

