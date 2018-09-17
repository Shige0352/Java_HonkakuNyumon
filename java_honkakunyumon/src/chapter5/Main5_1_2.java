package chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main5_1_2 {

	public class Student {
		private String name;

		private int score;

		public Student(String name, int score) {
			this.name = name;
			this.score = score;

		}

		public String getName() {
			return this.name;
		}

		public int getScore() {
			return this.score;
		}

		@Override
		public String toString() {
			return name + ":" + score;
		}


	}

	List<Student> studentList = new ArrayList<>();
	studentList.add(new Student("Murata", 100));
	studentList.add(new Student("Okada", 70));
	studentList.add(new Student("Tanimoto", 80));

	System.out.println(studentList);

	Collection.sort(studentList, new Comparator<student>() {
		@Override
		public int compare(Student student1, Student student2) {
			return Integer.compare(student1.getScore(), student2.getScore()):
		}
	});

	System.out.println(studentList);

}

List<Student> studentList = new ArrayList<>();
studentList.add(new Student("Murata", 100));
studentList.add(new Student("Okada", 70));
studentList.add(new Student("Tanimoto", 80));

System.out.println(studentList);

Collections.sort(sstudentList, (student1, student2) -> Integer.compare(student1.getScore(),
		 student2.getScore()));

System.out.println(studentList);




//Mian4_1_5 をラムダ式に変更

Student[] studentss = {
		new Student("ken", 100),
		new Student("Shin", 60),
		new Student("Takuya", 80)

};

Arrays.sort(Students, (Student o1, student o2) -> Integer.compare(o2.getName(), o1.getName()));

Arrays.stream(students).forEach(s -> System.out.println(s.getName() + ":" + s.getScore())):

for (int ch; (ch = stream.read()) != -1; ) {
	for (int ch; (ch = is.read() != -1; ) {

	})
}








