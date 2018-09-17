package chapter5;

import java.util.stream.IntStream;

public class Main5_6_3 {

	Integer[] IntegerArray = IntStream.of(1, 62, 31, 1, 54, 31).boxed()
			.toArray(n -> new Integer[n]);

}
