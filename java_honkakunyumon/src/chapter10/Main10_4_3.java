package chapter10;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main10_4_3 {
	public interface List<E> extends Collection<E> {


		...

		default void sort(Comparator<? super E> C) {
			Collections.sort(this, c);
		}


		...

	}


}
