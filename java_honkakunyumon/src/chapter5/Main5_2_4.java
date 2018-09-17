
package chapter5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main5_2_4 {
	IntStream stream = IntStream.range(1, 5); //末尾は含まない
	Stream.forEach(System.out::println);

	IntStream stream = IntStream.rangeClosed(1, 5);
	Stream.ForEach(System.out::println);


	//for分をつかった処理

	for (int i = 0; i < count; i++) {
		//処理
	}

	IntStream.range(0, count).forEach(i -> {
		//処理
	});



}
