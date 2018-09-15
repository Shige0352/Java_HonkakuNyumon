package chapter3;

public class Main3_2_5 {
	public static viod main(String[] args) {
		public class SuperClass {
			public SuperClass() {
			//略
			}

			public void superMethod() {
			//略
			}
		}

	}

}

public class SubClass extends SuperClass {

	public SubClass() {
		super();

		//略
	}

	//superClassが継承される
}

subClass subClass = new subClass();
SubClass.superMethod();  //SuperClassのクラスメソッドを使用する



