package chapter10;

public class Main10_3_1 {
	
	public class LifeCycleSample {
		public static int classVriable = 1; //クラス変数
		public int instanceVariable = 1; //インスタンス変数
		
		public void someMethod() {
			//メソッド内で使えるローカル変数
			int localVariable = 1;
			
			if (instanceVariable > 0) {
				//if ブロックの中で使えるローカル変数
				int localSubVariable = 1;
				
				...
			} // localVariableはここで破棄される
		}
		
		...	
	}
}
