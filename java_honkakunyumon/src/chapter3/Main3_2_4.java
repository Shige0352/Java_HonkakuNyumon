package chapter3;

public class Main3_2_4 {
	public static void main(String[] args) {

		public class StaticTest {
			static String staticField = "World"; //クラスフィールド

			static Stirng staticMethod() { //クラスメソッド
				return "yay!";
			}
		}

		String instanceField = "Hello"; //インスタンスメソッド

		String instanceMethod() {
			return instanceField + " " + staticField + " " + staticMethod();
		}
	}

	public class StaticTestMain {
		public static void main(String...args) {
			System.out.println(StaticTest.staticField);
			System.out.println(StaticTest.staticMethod);

			StaticTestMain.staticField = "Japan";
			System.out.println(StaitcTest.StaticField);

			StaticTestMain test = new StaticTest();
			System.out.println(test.StaticField);
			System.out.println(test.StaticMethod);
			System.out.println(test.instanceMethod);


			test.staticField = "Murata";
			System.out.print(test.instanceMethod());

			StaticTestMain test2 = "okada";

			test2.staticField = "okada";
			System.out.print(StaticTest.staticField);
			System.out.print(test.staticMethod);
			System.out.print(test2.staticField);
			System.out.print(test2.instanceMethod());


			test2.instanceField = "Yo";
			System.out.println(test2.instanceMethod());
			System.out.println(test2.instanceMethod());

		}
	}
}
