package chapter10;

import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.soap.Text;

public class Main10_1_3 {

	StringBuilder text = new StringBuilder("This is ");
	System.out.println("捜査前:" + text);
	text.append("an apple.");
	System.out.println("操作後::" + text);

	AtomicInteger number = new AtomicInteger(1);
	System.out.println("捜査前:" + number);
	Number.incrementAndGet();
	System.out.println("操作後::" + number);



}


public void someMethod() {
	StringBuilder text = new StringBuilder("This is ");
	AtomicInteger number = new AtomicInteger(1);
	System.out.println("捜査前:" + text + " " + number);

	write(text, number);

	System.out.println("操作後::" + number + " " + text);

}
public static void write(StringBuilder text, AtomicInteger number) {
	text.append("an apple.");
	number.incrementAndGet();

}
