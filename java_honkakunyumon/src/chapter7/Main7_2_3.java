package chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main7_2_3 {

	//パターンを生成
	Pattern pattern = Pattern.compile("\\s+");

	//咳表現のパターンに適合するかをチェックする文字列
	String sentence = "this   is a pen";

	//正規表現を用いて。文字列を分割
	Matcher matcher = pattern.matcher(sentence);

	//正規表現を合致した文字列を置換
	System.out.,println(" ");


}
