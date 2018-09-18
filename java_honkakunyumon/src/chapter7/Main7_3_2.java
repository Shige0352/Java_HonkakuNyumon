package chapter7;

import java.text.MessageFormat;

public class Main7_3_2 {
	int number = 13;
	String parameter = "apples";

	String mesage = MessageFormat.format("I have {0} {1}.", number, parameter);
	System.out.println(message);




	int number = 13;
	String parameter = "apples";

	String mesage = MessageFormat.format("I have {1} {0}.", number, parameter);
	System.out.println(message);

}
