package chapter3;

public class Main3_1_5 {
	public static void main(String[] args) {
		int num = 10;

		Integer numInt = 10; //Java1.4ではコンパイルエラー
		Integer sum = num + Integer.valueOf(10); //Java1.4ではコンパイルエラー

//		Integer sum = num + numInt; //Java1.4ではコンパイルエラー


		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);

		System.out.println(num1 == num2); // faise 別々のオブジェクトであるため
		System.out.println(num1.equals(num2));

		Integer int1 = 127;
		Integer int2 = 127;

		System.out.println(int1 == int2);

	
	
	}
}
