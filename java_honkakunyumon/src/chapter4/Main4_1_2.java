package chapter4;

import java.lang.reflect.Array;

public class Main4_1_2 {
	
	int[] array1 = new int[10];
	
	int[] array2 = { 1, 2, 3, 4, 5 };
	
	int[] array = new int[] {10, 9, 8, 7, 6 };
	
	System.out.println(array1.length);
	System.out.println(array2.length);
	System.out.println(array3.length);
	
	
	int[] array4;
	
	array4 = new int[] { 1, 2, 3, 4, 5 };
	array4 = { 1, 2, 3, 4, 5 };
	
	void log(String message, String[] args) {
		//省略
	}
	
	log("ユーザー登録をしました", new String[]{"userName", "Ken!");
	log("ユーザー登録をしました", {"userName", "Ken!"); // コンパイルエラー
	
	}
	
	}

}
