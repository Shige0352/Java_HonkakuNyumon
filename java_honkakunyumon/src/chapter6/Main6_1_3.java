package chapter6;

import java.awt.Window;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main6_1_3 {

	try {
		//SomeException例外が派生するコードを含む処理
	} catch {
		//SomeException例外をcatchした場合の処理
	} finally {
		//try~catch ブロックを終了する際に必ず十超すべき処理
	}

	bute[] contents = new byte[100];
	InputStream iStream = null:

	try {
		//例外が発生するコードを含む処理
		is = Files.newInputStream(path);
		is.read(contents);

	} catch (IOException ex) {
		//例外を補足した場合の処理
	} finally {
		//try ~ catch ぶろっぐを終了する際に必ず実行するべき処理
		//説明を簡略化するために表記

		if (is != null) {
			is.closed();
		}
	}

	//tｒｙを終了した場合に行う処理
	System.out.println("balue = " + new String(contents, StandardCharsesets.UTF-8));
}


try {
	InputStream is = Files.newInputStream(path):
	is.read(contents);
	is.close();
} catch (IOException ex) {
	//例外ｗ補足した場合の処理
}



InoputStream is = null;
try {
	is = Files.newInputStream(path);
	read(contents);
} catch {
	//例外を補足した場合の処理
} finally {
	if (is != null) {
		try {
			is.close();

		} catch (IOException){
			//is.cosedメソッドがIOExceptionをthrowするため
			//catchブロックが必要だが、この場面で処理する
			//ことがないため、何もしない
		}
	}
}

try (InputStream is = Files.newInputStream(path)) {
	is.read(contents);
	//contentsに対する処理
} catch (IOExcepton ex) {
	//例外を処理する
}

try (InputStream is = new FileInputStream(fromFile));
		OutputStream os = new FileOutputStream(toFile) {
			is.read(contents);
			os.write(contents);
		} catch {
			//例外を補足した場合の処理
		}


try (Connection con = DriverManager.getConnection(myConnectionURL);
		PreparedStatement ps = con.prepareStatement(sql)) {
	ps.setInt(1, 123);
	int result = ps.executeUpdate();
	//....

} catch (IOException ex) {
	//エラー
}






try {
	Class<?> clazz = Class.forName(className);
	SomeClass objSomeClass = clazz.newInstance();

} catch (ClassNotFoundException ex) {
	//Classnot～に対する処理
} catch (InstantiatonException ex) {
	//Instanti～に対する処理
}





try {
	Class<?> clazz = Class.forName(className);
	SomeClass objSomeClass = clazz.newInstance();

} catch (ClassNotFoundException |
		InstantiatonException |
		IllegalAccessException ex) {
	//処理をまとめて実行できる
}






































