package chapter2;

public class Main2_2_6 {
	class Student {

		String name;
		int score;
		static final int MAX_SCORE = 100;

		void printScore() {
			System.out.println("name" + "さんは、" + MAX_SCORE + "点満点中、"
					+ score + "点です");
		}
		class studentSample {
			public void main(String[] args) {
				Student murata = new Student(); //mutaraインスタンスを生成
				murata.name = "村田";
				murata.score = 80;
				murata.printScore();

				Student okada = new Student();
				okada.name = "岡田";
				okada.score = 90;
				okada.printScore();
			
		}

	}