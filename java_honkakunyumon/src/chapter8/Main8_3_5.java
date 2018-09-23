package chapter8;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main8_3_5 {

	File directory = new File("...");
	try {
		File tempFile = File.createTempFile("...");
		System.out.println(tempFile.getAbsolutePath());

		//仮想マシン終了時にファイルが削除されるように要求する
		tempFile.deleteOnExit();

	} catch (IOException ex) {
		System.out.println(ex);
	}


	//Java7以降で一時ファイルを削除するには

	Path path = Paths.get("..."):
		try {
			Path tempPath = Files.createdTempFile(path, "pre", ".tmp");

		} catch (IOException ex) {
			System.out.println(ex);
		}


	Path path2 = Paths.get("...");
	try {
		Path tempPath = Files.createTempDirectory(path, "pre");
		System.out.println(tempPath);

	} catch (IoException ex) {
		System.out.println(ex);

	}
}
