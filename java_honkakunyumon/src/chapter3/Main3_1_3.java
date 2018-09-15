package chapter3;

public class Main3_1_3 {
	public static void main(String[] args) {

		String name = new String("Murata"); //Stringインスタンスの参照をname変数に保持する
		System.out.println(name.length());

		System.out.println(name);


//		String name = "Murata";
//		System.out.println(name.length());


		String nullStr = null;
		if (nullStr != null) {
			System.out.println(nullStr.length());
		} else {
			System.out.println("nullStrはnull");
		}
	}

}
