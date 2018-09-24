package chapter10;

public class Main10_1_2 {

	String text1 = "This is an apple";
	String text2 = text1.replaceAll("aaple", "prange");
	System.out.println("元のオブジェクト:" + text1);
	System.out.println("戻り値          :" + text2);

}
