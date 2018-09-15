package chapter3;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main3_2_4_2 {
	public static void main(String[] args) {
		public class StaticTest {
			static final String GREETINg_MESSAGE = "Hello"; //クラスフィールドにfinal修飾子を付けたクラス定数を宣言


			static String staticField = "World"; //クラスフィールド

			static String staticMethod() {
				return "yay!";
			}

			String instanceField() { //インスタンスメソッド
				return instansceMethod() {
					return instanceField + " " + staticField + " " + staticmethod();
				}
			}

		}
	}

}
