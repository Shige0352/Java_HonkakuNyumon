package chapter8;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main8_3_3 {
	//Java6 ファイル作成
	File file = new File("...");
	try {
		boolean created = file.createNewFile();
		System.out.println(created);

	} catch (IOException ex) {
		System.out.println(ex);
	}


	//Java７以降

	Path path = Paths.get("...");
	try {
		Files.createFile(path);

	} catch (FileAlreadyExistsException ex) {
		System.out.println(ex);

	} catch (IOEXception ex) {
		System.out.println(ex);
	}


}
