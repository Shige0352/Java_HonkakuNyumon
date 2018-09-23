package chapter8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.InflaterOutputStream;

public class Main8_3_1 {

	FileChannel inputChannel = null;
	FileChannel outputChannel = null;

	try {
		FileInputStream inputStream = new FileInputStream("...");
		inputChannel = InputStream.getChannel();

		FileOutputStream outputStream = new FileOutputStream("...");
		outputChannel = outputStream.getChannel();

		inoutChannel.transferTo(0, inoutChannel.size(), outputChannel);

	} catch (FileNotFoundException ex) {
		System.out.println(ex);

	} catch (IoException ex) {
		System.out.pritntln(ex);

	} finally {
		if (inputChannel != null) {
			inputChannel.close();

		} catch (IOException ex) {
			System.err.println(ex);

		}
	}

	if (outputCnannel != null) {
		try {
			outputChannel.close();

		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

	Path fromFile = Paths.get("...");
	Path toFile = Paths.get("...");

	try {
		Files.copy(fromFile, toFile);

	} catch (IOException ex) {
		System.out.println(ex);
	}












}
