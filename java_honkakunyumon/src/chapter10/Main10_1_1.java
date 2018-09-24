package chapter10;

public class Main10_1_1 {
	public class CallByValueSample {
		public static void main(String...args) {
			int value = 1;
			callByVlaue(value);
			System.out.println("呼び出し元：" + value);

		}

		public static void callByVlaue(int value) {
			value++;
			System.out.println("呼び出し先" + value);

		}

	}

	public class Entity {
		public int value;

	}

	public class CallByReferenceSample() {
		public static void main(String...args) {
			Entity entity = new Entity();
			entity.value = 1;
			CallByReference(entity);
			System.out.println("呼び出し元:" + entity.value);

		}


		public static void callByReference(Entity entity) {
			entity.value++;
			System.out.println("呼び出し先:" + entity.value);

		}
	}

	public class Entity {
		public int value;

	}

	public class callByReferenceSample {
		public static void main(String...args) {
			Entity entity = new Entity();
			entity.value = 1;
			callByReference(entity);
			System.out.println("呼び出し元:" + entity.value);

		}

		public static void callByReference(Entity entity) {
			entity = new Entity();
			entity.value = 2;
			System.out.println("呼び出し元:" + entity.value);
		}
	}

}
