package chapter7;

public class Main7_2_4 {

	//正規表現と合致しているかのチェック
	System.out.println(sentence.matches("th.* is a .*\\.");

	//正規表現を用いた分割
	Stirng[] words = sentence.split("\\s+");
	for (String word : words) {
		System.out.println(word);
	}

	//正規表現を用いた置換
	System.ou.println(sentence.replaceAll("\\s+", " "));

}
