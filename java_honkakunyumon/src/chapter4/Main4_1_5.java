package chapter4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main4_1_5 {

	int[] array = {1, 1, 2, 3, 5, 8, 13 };

	System.out.println(array);
	System.out.println(Arrays.toString(array));

	Integer[] array ={ 3, 1,13, 2, 8, 5, 1 }
	Comparator<Integer> comparator = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return 02.compareTo(o1);
		}
	};


	Array.sort(array, c);
	System.out.println(Array.toString(array));


	class Student {
		private String name;
		private int score;

		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}


		public String getScore() {
			return name;

		}

		public int getScore() {
			return score;
		}
	}

	Student[] students = {
			new Student("ken", 100),
			new Student("Shin", 60),
			new Student("takuya", 80)
	};

	Comparator<Student> comparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return Integer.compare(o2.getScore(), Student o2);
		}
	};

	Arrays.sort(students, comparator);
	for (Stundent student : students) {
		System.out.println(student.getName()) + ":" + student.getScore());
	}
	
	int[] array = { 1, 1, 4, 5, 7, 8, 11, 12, 17, 21, 24 };
	int found = Array.binarySearch(array, 5); //「５」という数字を検索
	System.out.println(found);
	
	int notFound = array.binarySearch(array, 6);
	System.out.println(notFound);
	
	int[] array = { 3, 1, 13, 2, 8, 5, 1 };
	int[] value = ArraysbirnarySearch(array, 8);
	System.out.println(value);
}






















