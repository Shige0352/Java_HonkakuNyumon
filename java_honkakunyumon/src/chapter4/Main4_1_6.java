package chapter4;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class Main4_1_6 {

	void log(String message, String[] args) {
		System.out.println(message);
		System.out.println("パラメーター:");
		for (String arg : args) {
			System.out.println(arg);
		}


		log("ユーザを登録しました", new String[]{"userName", "ken"});
		log("エラーが発生しました", new String[]{"Cannot load file});
		log("処理を終了しました", new String[0]});
	}


	void log(String message, String...args) {
		System.out.println(message);
		System.out.println("パラメーター:");
		for (String arg : args) {
			System.out.println(arg);
		}


		log("ユーザを登録しました", "userName", "ken"});
		log("エラーが発生しました","Cannot load file");
		log("処理を終了しました");
	}




}























