package chapter3;

public class Main3_3_1 {
	public interface BaseService {
		public String say();
	}



	public abstract class AbstractBaseService implements BaseSrevice {

		protected String name;

		public AbstractBaseService(String name) {
			this,name = name;

		}
	}


	public class FooService extends AbstractBaseService {

		public FooService(String name) {
			super(name);
		}

		@Override
		public String say() {
			return "Hello";

		}
	}

	Object object = new FooService("hello");
	System.out.println(obj instanceof FooService); //ture
	System.out.println(obj instanceof AbstractBaseService); //親クラスなのでture
	System.out.println(obj instanceof BaseService); //インターフェイスを実装していないのでture
	System.out.println(obj instanceof Integer); //継承関係がないのでfalse


	if (obj instanceof FooService) {
		FooService service = (FooService) obj;
		System.out.print(service.say());
	}

}

