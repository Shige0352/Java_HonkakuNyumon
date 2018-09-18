package chapter7;

public class Main7_1_2 {
	public static void main(String[] args) {
		String aaa = "aaa";
		String bbb = "bbb";

		StringBuilder builder = new StringBuilder();
		builder.append(aaa);
		builder.append(bbb);

		String str = builder.toString();
		System.out.println(str);



		String str2 = aaa + bbb;
		System.out.println(str2);


		for (int i = 0; i < LOOP_COUNT; i++) {
			builder.append("a");
		}

		String string = "";
		for ( int i = 0; i < LOOP_COUNT; i++) {
			str += "a";
		}


		String string = "";
		for ( int i = 0; i < LOOP_COUNT; i++) {
			str = str.concat("a");
		}

	}

}
