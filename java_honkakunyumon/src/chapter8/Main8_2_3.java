package chapter8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.print.attribute.standard.PrinterLocation;
import javax.sound.sampled.Line;

public class Main8_2_3 {
	//Java6以前
	File file = new File("...");

	BufferedReader reader = null;
	try {
		reader = new BufferedReader(new InputStreamReader(\new FileInputStream(file),
				"UTF-8"));

		//ファイルを1行ずつ読み込む
		for ( \String line; (line = reader.readLine()) != null;) {
			System.out.println(line);
		}
	} catch (UnsupportEncoddingException ex) {
		//サポートしていないエンコードを指定した場合
		System.out.println(ex);

	} catch (FileNotfoundException) {
		System.err.println(ex);

	} catch (IOexception ex) {
		System.out.println(ex);

	} finally {
		if (reader != null) {
			reader.close();

		} catch (IOException ex) {
			System.out.pritnln(ex);


		}
	}

}
