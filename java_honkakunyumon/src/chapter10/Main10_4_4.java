package chapter10;

public class Main10_4_4 {
	public interface Bar {
		String say();


		static Bar newInstance(String message) {
			return new DefauitBar(message);
		}


	}

	class defaultBar implements Bar {


		private String message;

		public defaultBar(String message) {

		}

		@Override
		public String say() {
			return this.message;
		}


		Bar bar = Bar.newInstance("Hello Bar!");

		System.out.println(bar.say());

	}

}
package type.api;

public interface Foo {
	String say();

}

package type.api;
