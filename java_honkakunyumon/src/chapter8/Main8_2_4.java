package chapter8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main8_2_4 {
	File file = new File("...");

	BufferedWriter writer = null;
	try {
		writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), "UTF-8");

		//ファイルへの書き込み
		writer.append("test");
		writer.newLine();
		writer.append("test2");

	} catch (IOException ex){
		System.out.println(ex);

	} catch (UnsupporttedEncodingException ex) {
		System.out.println(ex);

	} finally {
		if (writer != null) {
			try {
				writer.close();
			} catch (IOException ex) {

				sysyrm.out.println(ex);
			}

		}
	}


	//java7以降

	Path path = new Paths.get("...");
	try (BufferedWriter writer2 = Files.newBufferedWriter(path, StsndardCharsets.UTF-8)) {
		Reader.line()
			.map(s -> s.split(" ")[0].distinct())
			.forEach(System.out::println);

	} catch (IOexception ex) {
		System.out.println(ex);

	}



}



























