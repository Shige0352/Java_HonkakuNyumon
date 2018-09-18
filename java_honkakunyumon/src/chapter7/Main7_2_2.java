package chapter7;

import java.util.regex.Pattern;

public class Main7_2_2 {

	//パターンを生成
	Pattern pattern = Pattern.compile("\\s+");

	//咳表現のパターンに適合するかをチェックする文字列
	String sentence = "this   is a pen";

	//正規表現を用いて。文字列を分割
	String[] words = pattern.split("sentence");

	for (String word : words) {
		System.out.println(word);
	}


}
