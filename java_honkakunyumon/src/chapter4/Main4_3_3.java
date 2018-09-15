package chapter4;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.events.Namespace;

public class Main4_3_3 {
	
	List<String> names = new ArrayList<>();
	
	names.add("Ken");
	names.add("Shin");
	names.add("Takauya");
	System.out.println("①のリストの中身：" + names.toString());
	
	names.add(2, "Satoshi");
	System.out.println("②のリストの中身：" + names.toString());
	
	names.set(0, "Makoto");
	System.out.println("③リストの中身：", + names.toString());
	
	String thirdName = names.get(2);
	System.out.println("④2番目の要素:" + thirdName);
	
	names.remove(1);
	System.out.println("リストの中身：" + names.toString());
	
	int size = names.size();
	System.out.println("要素の数" + size);
	
	int takuyaIndex = names.indexOf("takuya");
	System.out.println("Takuyaの位置："  takuyaIndex);
	
	boolean exists = names.contains("Shin");
	System.out.println("shinが含まれているか" + exists);
	
	
	

}
