package chapter2;

import java.util.Scanner;

public class Main2_1_5_4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("パスワードを入力してください");
		String str = in.nextLine();

		while (!str.equals("abc")) {
			System.out.println("パスワードが違います。正しいパスワードを入力してください");
			str = in.nextLine();
		}
		System.out.println("OK!");
	}

	@SuppressWarnings("resource")
	public void main2() {
		Scanner in2 = new Scanner(System.in);
		System.out.println("パスワードを入力してください");
		String str = in2.nextLine();

		while (true) {
			if (str.equals("abc")) {
				break;

			}
			System.out.println("パスワードが違います。正しいパスワードを入力してください");
			str = in2.nextLine();

		}

	}


}
