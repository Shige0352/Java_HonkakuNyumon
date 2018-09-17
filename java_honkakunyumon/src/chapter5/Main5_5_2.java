package chapter5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main5_5_2 {

	int count = 5;

	StringBuilder builder = new StringBuilder();
	for (int i = 0; i < count; i++) {
		if (i != 0) {
			builder.append(", ");

		}

		builder.append("?");
	}

	System.out.println(builder.toString());




	int count = 5;
	String[] array = new String[count];
	Arrays.fill(array, "?");
	String query = StringUtills.join(array, ", ");
	System.out.println(query);


	int count = 5;

	String query = IntStream.range(0, count)
			.mapToObj(i -> "?")
			.collect(Collectors.joining(", "));
	System.out.println(query);

}


