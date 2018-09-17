package chapter5;

import java.util.ArrayList;
import java.util.List;

public class Main5_1_1 {
	List<Student> students = new ArrayList<>();

	students.add(new Student("Ken", 100));
	students.add(new Student("Shin", 60));
	students.add(new Student("Takuya", 80));

	students.stream() //作成　Streamインスタンスを生成する
		.filter(s -> s.getScore() >= 70) //中間操作　70点以上のStudentの抽出
		.forEach(s -> System.out.println(s.getName()); //終端操作　名前を表示する




}
