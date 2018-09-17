
package chapter6;

import java.io.File;
import java.nio.file.Files;
import java.util.Properties;

public class Main6_2_1 {

	public String getVlaueFromFile(File file) throw IOException {
		Properties props = new Properties();
		props.load(Files.newInputStream(file.getPath()));

		//ファイル読み込みに失敗している場合はここにはこない
		//→props が正しくファイルを読み込めたかをIF文で判定する必要はない
		String value = prpps.getString("key");
		return value;
	}

	String strValue = "123";

	try {
		int intValue = Integer.valueOf(strValue);
		System,out.println("intValue is" + intValue);

	}catch (NumberFormatException ex) {
		//なにもしない
		//どうせエラーなんておきない
		//strValueが可変の値に変わったらどおする？
	}



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main6_2_1 {

	public String getValueFromFile(File file) throws IOException {
		properties props = new properties();
		props.load(Files.newInputStream(file.getPath));

		String value = props.getString("key");
		return value;


	}
}





















