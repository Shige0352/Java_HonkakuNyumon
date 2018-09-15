package chapter4;

import java.util.HashMap;
import java.util.Map;

public class Main4_4_1 {
	Map<Integer, String> map = new HashMap<>();
	map.put(1, "One");
	map.put(2, "Two");
	map.put(3, "Three");

	public class MapTest {

		private static final Map<Intteger, String> map;

		static {
			map = new HashMap<>();
			map.put(1, "One");
			map.put(2, "Two");
			map.put(3, "Three");

		}
		}
}
