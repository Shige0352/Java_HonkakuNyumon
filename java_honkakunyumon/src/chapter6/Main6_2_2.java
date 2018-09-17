package chapter6;

public class Main6_2_2 {


	String strValue = "123";
	try {
		int intVlaue = Integer.valueOf(strValue);
		System.out.println("intValue is " + intValue);
	} catch (NumberFromatException ex) {

	}


public class ValuePrinter {
	//ログオブジェクト

	private  Logger log = loggerFactory.getLogger(ValuePrinter.class);

	public void printValue() {
		String strValue = "abc";
		try {
			int intValue = Integer.valueOf(strValuer);
			System.out.println("intValue is" + intValue);
		}catch (NumberFormatException ex) {
			log.warm("数値ではありません");
		}
	}
}


String strValue = "abc";

try {
	int intValue = Integer.valueOf(strValue);
	System.out.println("intValue is" + intValue);

} catch (NumberFormatExceotion) {
	log.warm("数値ではありません" + ex);

}




String strValue = null;

try {
	strValue = props.get("key");

} catch (IOEception ex) {
	log.warm("プロパティ「key」が見つかりません", ex);
}

if (strValue.length() <5) {
	log.error("5文字以上必要");
	return;
}

String strVlue = null;
try {

}