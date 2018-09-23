package chapter8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.annotation.Resource;

public class Main8_4_1 {

	//メール設定
	System.mail.address=okada@acroquest.co.jp
	System.mail.enable=ture
	System.mail.erromessage=Cannot dend mail.

	//java6以前

	File file = new File("...");

	InputStream is = null;

	try {
		is = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(is);

		String address = properties.getProperty("System.mail.address");
		System.out.println(address);

	} catch (IoException ex) {
		//例外処理

	} finally {
		if (is != null) {
			is.close();

		} catch (IOException ex) {
			System.out.println(ex);

		}
	}


	//Java以降
	Path path = Paths.get("...");
	try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF-8))  {
		Properties properties = new Properties();
		properties.load(Reader);

		String address = properties.getProperty("///"):
		System.out.println(address);

	} catch (IOException ex) {
		//例外処理
	}


	ResourceBundle bundle = ResourceBundle.getBundle("mail");

	String message = bundle.getString("System.mail.err.message");
	System.out.println(message);




}








