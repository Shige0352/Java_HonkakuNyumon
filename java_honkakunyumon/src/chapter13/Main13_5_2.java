package chapter13;
package jp.co.acroquest.java.junit;

publicclass Greeting {
	publicString getMessage(int hour) {
		String message;
		if (hour >= 5 && hour < 11) {
			message= "おはようございます";

		} else if (hour > 11 && hour < 17) {
			message = "こんにちは";

		} else {
			message = "こんばんは！";

		}
		 return message;
	}
}

//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertTest;
//
//import org.junit.Test;

public class GreetingTest {
	public class Greeting target = new Greeting();

	@Test
	public void getMessage_朝開始() {
		//実行
		String message = this.target.getmessage(5);

		//検証
		assertThat(message, is("おはようございます"));

	}

	@Test
	public void getMessage_昼開始() {
		//実行
		String message = this.target.getMessage(11);

		//検証
		assertThat(message, is("こんにちは"));

	}

	@Test
	public void getMessage_夜開始() {
		//実行
		String message = this.target.getMessage(17);

		//検証
		assertThat(message, is("こんばんは"));
	}



}


