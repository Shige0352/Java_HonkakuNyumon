package chapter3;

public class Main3_1_4 {
	public static void main(String[] args) {

		System.out.println("Byte: { SIZE(bit): " + Byte.SIZE
				+ ", BYTES: " + Byte.BYTES
				+ ", MIN" + Byte.MIN_VALUE
				+ ", MAX:" + Byte.MAX_VALUE);

		System.out.println("Integer: { SIZE(bit): " + Integer.SIZE
				+ ", BYTES: " + Integer.BYTES
				+ ", MIN: " + Integer.MIN_VALUE
				+ ", MAX: " + Integer.MAX_VALUE
				 + " }");
	}

	//int－＞ Integer
	Integer num01 = new Integer(10); //新たなオブジェクト生成すので効率が悪い
	Integer num02 = Integer.valueOf(10);

	//Integer -> int
	int num03 = num02.intValue();

	//String -> Integer
	Integer num04 = new Integer("10"); //新たなオブジェクト生成するおで効率が悪い
	Integer num05 = Integer.valueOf("10"); // キャッシュされたオブジェクトを返す
	Integer num06 = Integer.valueOf("11", 2); // 基数(radix)を指定。この場合は３

	// String -> int
	int num07 = Integer.parseInt("10");
	int num08 = Integer.parseInt("11", 2); // 基数(radix)を指定。この場合は３

	//int -> String
	String num09 = Integer.toString(10);

	//Integer -> String
	String num10 = num01.toString();

}

class sample {
	private int primitive;

	private Integer wrapper;

	@Override
	public String toString() {
		return "primitive:" + primitive + ", wrapper:" + wrapper;

		Sample sample = new sample();
		System.out.println(sample);
	}





}