package chapter12;

public class Configure {

	private Configure() {
		//設定情報の読み込み処理
	}

	public static Configure getInstance() {
		return instance;
	}
}

public class SampleMain {
	public static void main(String...args) {
		Configure configure = Configure.getInstance();
	}
}
