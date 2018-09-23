package chapter8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main8_3_4 {

	File file = new File("...");
	boolean created = file.mkdir();
	System.put,println(created);


	File file = new File("C:/work/newDir/newSubDir");
	boolean created = file.mkdirs();
	System.out.println(created);


	Path path = Paths.get("...");
	try {
		Files.createDirectory(path);

	} catch (NoSuchFileException ex) {
		System.out.println(ex);

	} catch (IOException ex) {
		System.out.println(ex);
	}

	Path path = Paths.get("...");
	try {
		Files.createdDirectories(path);

	} catch (IOException ex) {
		System.out.println(ex);
	}




}

















