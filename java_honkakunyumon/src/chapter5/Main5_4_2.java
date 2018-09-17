package chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import chapter5.Main5_1_2.Student;

public class Main5_4_2 {


	List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");

	List<String> newList= list.stream()
			.filter(p -> p.length() > 5)
			.collect(Collectors.toList());

	List<String> list2 = Arrays.asList("Murata", "Okada", "Tanimoto");

	String joined = list.stream()
			.filter(Predicate -> Predicate.length() > 5)
			.collect(Collectors.joining(","));

	System.outo.println(joined);




	List<Student> students = new ArrayList<>();
	students.add(new Student("Ken", 100));
	students.add(new Student("Shin", 60));
	students.add(new Student("Takuya", 80));
	students.add(new Student("Sakamoto", 80));


	Map<Integer, List<Student>> map = students.stream()
			.collect(Collectors.groupingBy(Student::getScore));

	//Mapから100点の生徒のリストを取り出す
	List<Student> perfects = map.get(100);
	perfects.forEach(s -> System.out.println(s.getname()));
}
