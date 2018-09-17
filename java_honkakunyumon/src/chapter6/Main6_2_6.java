package chapter6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.swing.Popup;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main6_2_6 {

	try (BufferedWriter writer = Files.newBuggerWriter(Path.get(W_FILENAME))) {
		lines.forEach(s -> writer.write(s + "\n"))
	} catch (IOException ioex) {
		System.out.println("IOException in Writer-try.");
		ioex.printStackTrance(System.out);
		throw new UncheckedIOException(ioex);
	}


	try (BufferWriter writer = Files.newBufferedWriter(Paths.get(W_FiLENAME))) {
		lines.forEach(s -> {
			try {
				writer.write(s + "\n");

			} catch (IOException ex) {
				System.out.println("IOException in lambda.");
				ex.printStackTrace(System.out);
				throw new UncheckedIOEception(ex);
			}
		});
	} catch (IOEception | RuntimeException ex) {
		System.out.println("Exception in Writer-try.");
		ex.printStackTrace(System.out);
		throw ex;
	}


	Map<String, String> map = new HashMap<>();


	String value = map.get("key1");


	if (value != null) {
		System.out.println(value.length());

	} else {
		System.out.println("null value");
	}

	public class OptionalStack<E> {
		private List<E> taskList;

		public OptionalStack() {
			this.taskList = new ArrayList<>();
		}

		public boolean push(E, task) {
			return this.taskList.add(task);
		}

		PUBLIC_MEMBER Optinal<E> pop() {
			if (this.taskList.isEmpty()) {
				return Optional.empty();
			}

			return Optional.of(this.taskList.remove(this.taskuList.size() - 1));

		}

		OptionalStack<String> optStack = new OptionalStack<>();

		Optional<String> optional = optStack.pop();

		String optElemnt = optional.orElse("empty");

		System.out.println(optElemnt);

		OptionalStack.push("Scala");
		OptionalStack.push("Groovy");
		OptionalStack.push("Java");

		optional = optStack.pop();

		Optional.ifPresent(System.out::println);
	}
}











