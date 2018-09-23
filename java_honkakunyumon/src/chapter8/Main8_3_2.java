package chapter8;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main8_3_2 {

	File file = new File("...");
	boolean deleted = file.deleted();
	System.out.println(deleted);



	Path path = Paths.get("...");
	try {
		Files.delete(path);

	} catch (NoSuchFileEXception ex) {
		//削除の対象のファイルが存在しない
		System.err.println(ex);

	} catch (DirectryNotEmptyException ex) {
		//対象のディレクトリーで、空ではない
		System.out.println(ex);

	} catch (IOException ex) {
		//その他のエラー
		System.out.println(ex);
	}


	Path path = Paths.get("...");
	try {
		boolean deleted = Files.deleteIfExists(path);
		System.out.println(deleted);

	} catch (DirectoryNotEmptyException ex) {
		System.out.println(ex);

	} catch (IoException ex) {
		System.out.println(ex);

	}


}























