package chapter8;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main8_1_2 {
	//(1)ファイルを絶対パスで指定
	Path path1 = Paths.get("...");

	//ファイルを相対パスで指定
	Path path2 = Paths.get("...");

	Path path3 = Paths.get("...", "work", "sample3.text");

	//URI形式で指定
	URI uri = URI.create("...");
	Path path4 = Paths.get(uri);


	//通常の絶対パス指定
	Path path1 = Paths.get(uri);

	//親ディレクトリーの取得
	System.out.parintln(path1)

	//同一のディレクトリーの別のファイルを取得
	System.out.println(path1.resolveSilbling("..."));

	//1つ親のディレクトリーにあるファイルを取得
	System.out.println(path.resolveSibling(...));

	Path path = Paths.get("...");

	//Fileインスタンスに変換
	File file = path.toFile();

	//URIインスタンスに変換
	URI uri = path.toUri();

}
