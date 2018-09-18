package chapter7;

import java.util.ArrayList;
import java.util.List;

public class Main7_1_4 {

	List<String> stringsList = new ArrayList<>();
	stringList.add("This");
	stringList.add("is");
	stringList.add("a");
	stringList.add("pen");

	StringBuilder message = new StringBuilder();
	for (string word : StringList) {
		message.append(word);
		message.append(" ");
	}

	if (message.length() > 0) {
		message.deleteCharAt(message.length() - 1);
	}

	System.out.println(message.toString());



	List<String> stringsList = new ArrayList<>();
	stringList.add("This");
	stringList.add("is");
	stringList.add("a");
	stringList.add("pen");

	String message = String.join(" ", stringList);

	System.out.println(message);

	String message = String.join(" ", "www", "acroquwst", "co", "jp");
	System.out.println(message);

}

