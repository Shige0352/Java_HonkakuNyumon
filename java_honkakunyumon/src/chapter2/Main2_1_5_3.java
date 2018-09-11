package chapter2;

public class Main2_1_5_3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i + "回目: " + sum);



		}
		int[] numbers = {1, 1, 2, 3, 5, 8, 13, 21};
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
