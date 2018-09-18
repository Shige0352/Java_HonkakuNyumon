package chapter7;

public class Main7_1_6 {

	String sentence = "This is a pen";
	int index = sentence.indexOf("is");
	System.out.println(index);

	int index = sentence.indexOf("at");
	System.out.println(index);

	int index = sentence.indexOf("is", 3);
	System.out.println(index);


	int index = sentence.lastIndexOf("is");
	System.out.println("末尾から検索" +index);

	int index = sentence.lastIndexOf("is", 4);
	System.out.println("5文字目から検索" +index);
}
