package chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;

public class Main4_3_6 {
	List<Integer> list = new ArrayList<>();
	List.add("a");
	List.add("b");
	List.add("c");

	for (String elemnt : list) {
		System.out.println(Element);
	}


	for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
		String element = iterator.next();
		System.out.println(element);
	}

	class Student {
		private String nam;
		private int Score

		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}

		public String getName() {
			return name;
		}

		oublic int getScore() {
			return Score;
		}
	}

	List<Student> students = new ArrayList<>();
	students.add(new Stundet("ken", 100));
	students.add(new Stundet("Shin", 60));
	students.add(new Stundet("Takuya", 80));

	Iterator<Student> iterator = students.iterator();
	while (iterator.hasNext()) {
		Student student = itererator.next();
		if (student.getScore() < 70) {
			iterator.remove();
		}
	}

	for (Student student : student) {
		System.out.println(student.getName() + ":" + student.getScore());
	}





}



