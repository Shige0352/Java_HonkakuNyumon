package chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main7_2_1 {

	//正規表現のパターン生成
	Pattern pattern = Pattern.compile("This is a .\\.");

	//正規証言のパターンに適合するかの確認する文字列
	String sentence = "This is a pen";

	//正規表現処理を行うためのクラスを取得
	Matcher matcher = pattern.matcher(sentence);

	//正規表現のパターンに適合するかの確認
	if (matcher.matches()) {
		System.out.println("適合する");
	} else {
		System.out.println("適合しない");
	}
}
