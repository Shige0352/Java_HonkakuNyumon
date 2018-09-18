package chapter7;

import java.nio.charset.Charset;

import javax.management.BadAttributeValueExpException;

public class Main7_4_2 {

	String string = "あいうえお";


	System.out.println("UTF-8 : ");
	byte[] utf8 = str.getBytes("UTF-8");
	for (byte b : utf8) {
		System.out.println("%02x", b);
	}
	System.out.println();

	System.out.println("UTF-16 : ");
	byte[] utf16 = str.getBytes("UTF-16");
	for (byte b : utf16) {
		System.out.println("%02x", b);
	}
	System.out.println();


	System.out.println("UTF-32 : ");
	byte[] utf32 = str.getBytes("UTF-32");
	for (byte b : utf32) {
		System.out.println("%02x", b);
	}
	System.out.println();


	System.out.println("MS932 : ");
	byte[] ms932 = str.getBytes(Charset.forName("ms932"));
	for (byte b : ms932) {
		System.out.println("%02x", b);
	}
	System.out.println();

}
