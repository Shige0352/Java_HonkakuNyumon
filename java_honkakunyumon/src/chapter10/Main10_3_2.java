package chapter10;

import java.time.LocalDate;

public class Main10_3_2 {

	public class EmployeeService {
		private int id;
		private String name;
		private LocalDate birth;
		//setter getter は省略

		public void create () {
			//id name birthの値をがいるに保存する

		}

		public void get(int id) {
			//指定されたidと合致するデータをファイルから読み取り
			//id,name,birthに値をセットする
		}
	}


}


public void MainService {
	private EmployeeService employeeService = new EmployeeService();

	public void registar() {
		this.employeeService.setId(1);
		this.employeeService.setName("佐藤");
		this.employeeService.setBirth(LocalDate.of(1990, 2, 7));
		this.employeeService.setcreate();

	}

	public void show() {
		this.employeeService.get(1);
		System.out.println(this.employeeService.getName());
		System.out.println(this.employeeService.getBirth());
	}
}


public class Employee {
	public int id;
	public String name;
	public LocalDate birth;

}

public class EmployeeService {
	public void create(Employee employee) {
		//ファイルに保存
	}

	public Employee get(int id) {
		// 指定されたidが合致するデータをファイルから読み取り返す
	}

}

public void MainService {
	private EmployeeService employeeService = new EmployeeService();

	public void registar() {
		Employee employee = new Employee();
		employee.id = 1;
		employee.name = "佐藤";
		employee.birth = LocalDate.of(1980, 2, 7);
		this.employeeService.breate(employee);

	}
	public void show() {
		Employee employee = this.employeeService.get(1);
		System.out.println(employee.name);
		System.out.println(employee.birth);

	}

	public class StringUtil {
		//staticは付けない
		public String isEmpty(String text) {
			return (text == null || text.length() == 0);

		}
	}

	public class MainService {
		private static StringUtil stringUtils = new StringUtil();

		public void execute(String text) {
			//staticインスタンスのメソッドを呼び出す
			if (stringUtils.isEmpty(text)) {
				// ...

			}
		}
	}
}

















