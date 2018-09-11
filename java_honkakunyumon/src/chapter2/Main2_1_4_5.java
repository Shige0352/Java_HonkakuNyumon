package chapter2;

public class Main2_1_4_5 {
	public static void main(String[] args) {

		int number = 0x12345678;
		int lower = number & 0x0000ffff;
		System.out.printf("lower = %x\n", lower);

	}
}
