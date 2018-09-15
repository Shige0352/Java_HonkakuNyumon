package chapter3;

public class Main3_2_7 {

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
			return message;
		}
	}

	public interface TaskHandler {


		public static final int TASK_TYPE_PRIVATE = 0;
		public static final int TASK_TYPE_WORK = 1;

		boolean handle(TaskHandler task);


	}


}
