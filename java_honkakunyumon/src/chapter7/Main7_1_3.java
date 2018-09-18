package chapter7;

public class Main7_1_3 {

	String sentence = "This is a pen.";

	String[] words = sentence.split(" ");

	for (string word : words) {
		System.out.println(word);
	}

	Stirng url = "www.acroquwst.co.jp";

	String[] words = url.split("\\.");
	//.は正規表現だと任意の文字とみなされるため
	//エスケープシーケンスを付ける

	for (String word : words) {
		System.out.println(word);
	}
}
