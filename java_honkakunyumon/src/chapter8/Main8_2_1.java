package chapter8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main8_2_1 {

	//Java6以前
	File file = new File("C:/work/sample");

	InputStream iStream = null;

	try {
		//ファイルを1文字ずつ読み込んで表示する
		is = new FileInputStream(file);
		for (int ch; (ch = is.read()) != -1) {
			System.out.println((char) ch);
		}

	} catch (IOException ex) {
		//ファイルの読み込みに失敗した場合
		System.out.println(ex);
	} catch (FileNotFoundException ex) {
		System.out.pritnln(ex);

	} finally {
		//ストリームのスローズ処理
		if (is = != null) {
			try {
				iStream.close();
			} catch (IOException ex) {
				System.out.println(ex);
			}
		}
	}

	//Java7以降

	Path path = Paths.get("..."));

	try (InputStream is = Files.newInputStream(path)){

		for (int ch; (ch = is.read()) != -1) {
			System,out.println(ex);
		}

	}

}
















