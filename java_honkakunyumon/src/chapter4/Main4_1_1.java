package chapter4;

import java.awt.geom.Ellipse2D;
import java.lang.reflect.Array;

public class Main4_1_1 {

	int[] array = new int[10];
	Array[0] = 1;
	Array[1] = 1;
	Array[2] = 2;
	Array[3] = 3;
	Array[4] = 5;
	System.out.println(array[0]);
	System.out.println(array[4]);
	
	
	int fib0 = 0;
	int fib1 = 1;
	int fib2 = fib0 + fib1;
	int fib3 = fib1 + fib2;
	int fib4 = fib2 + fib3;
	
	int fib10 = fib8 + fib9;
	
	System.out.println(fib1);
	System.out.println(fib2);
	System.out.println(fib3);
	System.out.println(fib4);
	System.out.println(fib10);
	
	
	int[] array = new int[11];
	for (int i = 0; i < 11; i++) {
		array[i] = 0;
	} else  if (i ==1) {
		array[i] = 1;
	} else {
		array[i] = array[i = 1] + array[i - 2];
	}
	
}
for (int value : array) {
	System.out.println(value);
}


