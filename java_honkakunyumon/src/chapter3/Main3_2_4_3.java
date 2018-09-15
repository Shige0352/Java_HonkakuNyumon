package chapter3;

public class Main3_2_4_3 {
	public static void main(String[] args) {
		public class StaticTestMain {
			public static void main(String...args) {
				System.out.println(StaitcTest.GREETING_MESSAGE);
				System.out.println(StaitcTest.staticField);
				System.out.println(StaitcTest.staicMethod);
				
				
				//StaicTest.GREETING_MESSAGE = "Hello!"; コンパイルメッセージ
				
				
				StaticTestMain.staticField = "Japan";
				
				StaitcTest.test = new StaticTest();
				System.out.println(test.instanceMethod);
				
			}
		}
		
	}

}
