package chapter6;

public class Main6_2_3 {

	public void caller {
		try {
			callee();
		} catch (Exception ex) {
			//補足しなければならない
		}
	}

	private void callee() throws Exception {

	}

	public void caller() {
		try {
			callee();

		} catch (Exception ex) {
			//発生した例外の種類でcatchブロックを分けることができない
		}
	}

	private void callee() throws Exception {

		Ckass someClass = Class.forName(className);
		someClass obj = someClass.newIntstance();
	}

	public void caller() {
		try {
			callee();
		} catch (Exception ex) {

		}
	}


	private void callee() throws Exception {
		String string = null;
	}

	Systemlout.println("str.length = " + str.length());

}
