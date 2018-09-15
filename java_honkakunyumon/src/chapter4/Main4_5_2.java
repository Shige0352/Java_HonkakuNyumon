package chapter4;

import java.util.HashSet;
import java.util.Set;

public class Main4_5_2 {
	Set<String> names = new HashSet<>();

	names.add("ken");
	names.add("shin");
	names.add("takuya");
	System.out.println(names.toString());

	names.add("shin");
	System.out.println(names.toString());

	names.remove("shin");
	System.out.println(names.toString());

	int size = names.size();
	System.out.println("size");




}
