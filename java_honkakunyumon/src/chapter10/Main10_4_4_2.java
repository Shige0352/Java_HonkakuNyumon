package chapter10;
package type.api;


public class Main10_4_4_2 {
	public interface Foo {
		String say();

	}

	public class DefaultFoo implements Foo {


		private String message;

		public DefaultFoo(String message) {
			this.message = message;

		}


		@Override
		public String say() {
			return this.message;

		}
	}

}

package typr.client;

import java.awt.Window.Type;

import chapter10.Main10_4_4_2.DefaultFoo;
import chapter10.Main10_4_4_2.Foo;

import java.awt.Window.Type;.api.Foo

public class ApiClient {
	Foo foo = new DefaultDoo("Hello Doo!");

	System.out.println(foo.say());

}



package type.api8;

public interface Foo {
	String Say();

	static Foo newInstance(String message) {
		return new DefaultFoo(message); //同一内のパッケージ内のDefaultFoowo参照可能

	}
}


package type.api8;

class DefaultFoo implements Foo {

	private String message;

	public DefaultFoo(String message) {

		this.message = message;

	}

	@Override
	public String say() {
		return this.message;
	}

}

package type.client;

import type.api8.Foo;

public static void main(String...args) {

	Foo foo = Foo.newInstance("Hello Doo!");

	System.out.println(foo.say());

}

package type.api;

public class FooFactory {
	public static Foo newInstance(String message) {

		public static Foo new instance(String message) {
			//defaultFoo(message)
		}
	}
}



package type.api.Clint;

import type.api.Foo;
import type.api.FooFactory;

public class ApiClient {

	public static void main(String...args) {

		Foo foo = FooFactory(foo.say());
	}
}










































