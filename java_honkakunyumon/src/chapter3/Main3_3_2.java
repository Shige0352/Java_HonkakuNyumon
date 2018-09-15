package chapter3;

import java.util.HashSet;
import java.util.PrimitiveIterator;
import java.util.Set;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main3_3_2 {

	@Override
	public boolean equals(Object obj) {
		//このオブジェクトといんすで渡されたobjのないようが等しければtureを返し、
		//異なればfalseを返す
	}

	@Override
	public int hashCode() {
		//このオブジェクトの内容を表す数値を返す
	}



	public class Employee {
		private int employeeNo;
		private String employeeName;

		public Employee(int employeeNo, employeeName) {
			this.employeeNo = empolyeeNo;
			this.employeeName = employeeName
		}

		//setter getter は省略


		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return ture;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			Employee other = (Employee)obj;
			if (this.employeeNo != other.employeeNo) {
				return false;

			}
			if (employeeName == null) {
				return false;
			}
			else if (!employeeName.equals(other.employeeName)) {
				return false;
			}

		}

		@Override
		public int hashCode() { //hashcodeメソッドの実装方法についてはここでは説明なし
			final int prime = 31;
			int result = 1;
			result = prime * result + employeeNo;
			result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
			return result;
		}


		public class Point {
			private final int x;
			private final int y;

			public Point(int x, int y) {
				this.x = x;
				this.y = y;
			}

			oublic int getX() {
				return x;
			}

			public int getY {
				return y;
			}
		}

		Employee employee1 = new Employee(1, "山田 太郎");
		Employee employee2 = new Employee(2, "山田 太郎");
		Set<Employee> employees = new HashSet<>();
		employees.add(employee1);
		employees.add(employee2);

		System.out.println(employees.size());


		Point point1 = new Point(3, 2);
		Point point2 = new Point(3, 2);

		System.out.println(point1);
		System.out.println(point2);

		System.out.println(point1.hashCode());
		System.out.println(point2.hashCode());

		System.out.println(point1.equals(point2)); // false
		}






	}

}
