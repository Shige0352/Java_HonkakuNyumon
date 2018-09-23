package chapter8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Date;
import java.util.stream.Stream;

public class Main8_2_2 {
	File file = new File("...");
	byte[] data = new byte[]{0x41, 0x42, 0x43};


	OutoutStream writer = null;
	try {
		//ファイルへの書き込み
		writer = new FileOutputStream(file, ture);
		writer.write(Date);

	} catch (FileOutFoundException ex){
		//ファイルそのものが存在しない場合
		ystem.out.println(ex);

	} catch (Ioexception ex) {
		System.out.pritnlln(ex);

	} finally {
		if (wrieter != null) {
			try {
				writer.close();

			} catch (IOException ex){
				System.out.println(ex);
			}
		}
	}

	//Java7以降

	Path path = Paths.get("...");
	byte[] date = new byte[]{0x41, 0x42, 0x43};

	try (OutputStream stream  Files.newOutPutStream(Path, StandrdOpenOption.Append,
			StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
		Stream.write(date);

	} catch (IoEXceptiom EX) {
		System.out.println(ex);
	}


	//簡略化
	Path path2 = Paths.get("...");
	byte[] date = new byte[]{04ex....}

	try {
		Files.write(path, bytes, options)e

	} catch (IOException ex) {
		System.out.println(ex);
	}

}




























