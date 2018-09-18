package chapter7;

public class Main7_4_5 {


	String aaa = "aaa";
	String aa = "aa";
	String a = "a";

	System.out.println(aaa.equals(aa + a));
	System.out.println(aaa = (aa + a));
	System.out.println(aaa = (aa + a).intern());


}
