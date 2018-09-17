package chapter5;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main5_2_3 {
	Map<String, String> map = new HashMap<>();
	Map.put("1", "Murata");
	Map.put("2", "Okada");
	Map.put("3", "Tanimoto");

	Stream<Entry<String, String>> stream = map.entrySet().stream();
	Stream.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));


	Map<String, String> map = new HashMap<>();
	Map.put("1", "Murata");
	Map.put("2", "Okada");
	Map.put("3", "Tanimoto");

	Stream<String> stream = map.values().stream();
	Stream.forEach(System.out::println);
}
