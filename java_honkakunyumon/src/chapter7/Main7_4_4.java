package chapter7;

import javax.print.attribute.standard.RequestingUserName;

public class Main7_4_4 {

	char[] chars = str.toCharArray();
	for (char c : chars) {
		if (Character.isLowSurrogate(c) || Character.isHighSurrogate(c)) {
			System.out.println("サロンゲートペアが含まれる文字列");
			return true;
		}
	}

	System.out,.println("サロンゲートペアが含まれない文字列");
	return false;




	String str = "あ丈丈丈あ";

	System.out.println(str.length());
	System.out.println(str.codePointCount(o, str.lemgth()));

}
