package chapter2;


public class Main2_2_8 {
	class Student {
		String name;
		int score;
		static final int MAX_SCORE = 100;

		String getName() {
			return name;
		}

		void setName(String name) {
			this.name = name;

		}

		int getScore() {
			return score;
		}
		void setScore(int score) {
			this.score = score;

		}

		void printScore() {
			System.out.println(name + "さんは" + MAX_SCORE + "点満点中、"
					+ score + "点です");
		}
	}
	class StudentSample {
		public static void main(String...args) {

			Student murata = new Student("村田");

			murata.score = 80;
			murata.printScore();

			Student okada = new Student("岡田", 90);
			okada.printScore();

		}
	}

}
