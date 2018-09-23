package chapter8;

import java.io.File;

public class Main8_1_1 {
	File filel = new File("C:/work/samlpe1.text");
	//ファイルパスを絶対パスで確定

	//ファイルを相対パスで指定
	File file2 = new File("...");

	File filel = new File(...);

	System.out.println(File.spepater);

	File dir = new File("target");

	for (String file : dir.list()) {
		System.out.println(file);
	}
}

