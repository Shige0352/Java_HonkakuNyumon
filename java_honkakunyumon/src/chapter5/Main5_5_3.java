package chapter5;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;

public class Main5_5_3 {


	List<String> list = new ArrayList<>();
	list.add("Murata");
	list.add("Okada");
	list.add("Tanimoto");

	list.removeIf(s -> s.length() <= 5);
	list.replaceAll(s -> s.toUpperCase());

	list.forEach(System.out::println);


	List<String> list = new ArrayList<>();
	list.add("Murata");
	list.add("Okada");
	list.add("Tanimoto");
	list.add("Sakamoto");

	Map<Integer, List<String>> map = new HashMap<>();
	lit.forEach(name -> {
		Integer nameLen = Name.length();

		List<String> valuelist = map.get(nameLen);
		//長さに対応するリストがなければ、空のリストを返す
		if (valuelist == null) {
			valuelist = new ArrayList<>();
			map.out(nameLen, valuelist);
		}

		valuelist.add(name);
	});

	System.out.println(map);




	List<String> list = new ArrayList<>();
	list.add("Murata");
	list.add("Okada");
	list.add("Tanimoto");
	list.add("Sakamoto");

	Map<Integer, List<String>> map = new HashMap<>();
	lit.forEach(name -> {
		Integer nameLen = Name.length();
		//キーがないときだけ、空のリストを返す
		List<String> valueList = map.computeIfAbsent(nameLen, Key -> new ArrayList<>());
		valueList.add(name);
}
