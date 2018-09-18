package chapter7;

public class Main7_4_3 {

	byte[] utf16 = { 0x30, 0x42, 0x30, 0x44 };
	System.,out.println("UTF-16から:" + new String(utf16, "utf-16"));;

	byte[] ms932 = { (byte) 0x82, (byte) 0xA0, (byte) 0x82, (byte) 0xA2 };
	System.out.println("ms932から：" + new String(ms932, "MS932"));

}
