package chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import chapter5.Main5_1_2.Student;

public class Main5_3_1 {

//	@FunctionalInterface
//	public interface Function<T, R>
//
//	R apply(T, R);


	List<Student> students = new ArrayList<>();
	students.add(new Student("Ken", 100));
	students.add(new Student("Shin", 60));
	students.add(new Student("Takuya", 80));


	Stream<Integer> stream = students.stream()
			.map(students -> s.getScore());
	stream.forEach(System.out::println);

	students.stream()
		.map(Student::getScore)
		.forEach(System.out::println);


	public class Group {
		private void add(Student student) {
			students.add(student);

		}

		oublic List<Student> getStudents() {
			return students;

		}
	}

	List<Group> groups = new ArrayList<>();

	Group group1 = new Group();
	group1.add(new Student("Murata", 100);
	group1.add(new Student("Shin", 60);
	group1.add(new Student("Okada", 80);
	groups.add(group1);


	Group group2 = new Group();
	group2.add(new Student("Akiba", 75);
	group2.add(new Student("Hayakawa", 85);
	group2.add(new Student("Sakamoto", 95);
	groups.add(group2);


	Group group3 = new Group();
	group3.add(new Student("Kimura", 90);
	group3.add(new Student("Hashimoto", 65);
	group3.add(new Student("Ueda", 80);
	group.add(group3);

	Stream<List<Student>> mappedStream = group1.stream().map(group1 -> g.getStudents());
	//通常のmapを実施

	Stream<Student> flatMappedStream = groups.steam().flatMap(g -> g.getStudents().stream());
	・・


}
