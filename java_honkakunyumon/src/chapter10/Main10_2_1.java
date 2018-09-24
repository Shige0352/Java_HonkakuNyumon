package chapter10;

public class Main10_2_1 {
	
	class Entity { // アクセス修飾子が指定されていないので、package privateクラスになる
		
		//メンバー自体はpublicだが、クラスがpackage privateなので
		//同一パッケージからのみアクセスできる
		public int value;
		
	}
}
