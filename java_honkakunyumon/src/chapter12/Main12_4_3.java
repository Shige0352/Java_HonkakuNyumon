package chapter12;

import java.util.ArrayList;

import chapter10.Main10_4_3.List;

public interface Iterable<T> {
	iterator<T> iterator();

}


public interface Iterator<E> {
	boolean hasNext();

	E next();

	void remove();

}

//Collection.java
public interface Collection<E> extends Iterable<E> {
	//略
}

//SampleMain.java
public class SampleMain {
	List<String> list = new ArrayList<>();
	List.add("string1");
	List.add("string2");
	List.add("string3");

	Iterator<String> itr = list,iterator();

	while (itr.hasNext()) {
		String string = itr.next();
		System.out.ptrintln(str);

	}
}