package chapter2;

public class Main2_3_1 {
//生徒の点数を扱うクラス

	class Student {
//		名前
		String name;

//		点数
		int score;

//		最高点
		static final int MAX_SCORE = 100;

//		名前と点数を指定してインスタンスを生成します
//		@param argName 名前
//		@param argScore 点数

		Student(String argName, int argScore) {
			name = argName;
			score = argScore;
		}


//		名前を指定してインスタンスを生成します
//		@param argName 名前

		public Student(String argsName) {
			name = argsName;

		}

//		点数を標準表示します
		void printScore() {
			System.out.println(name + "さんは" + MAX_SCORE + "点満点中" + score + "点数です");
		}
	}


}
