package chapter3;

public class Main3_2_8 {

	public interface TaskHandler {
		boolean handle(TaskHandler task);

	}

	public class AnonymousClassSample {

		public static void main(String...args) {
			//TaskHandklerインターフェイスを実装する匿名くらすを定義し、インスタンス化する
			TaskHandler taskHandler = new TaskHandler() {
				//taskに関する処理
			}
		};
		TaskHandler myTaskHandler = new Task();
		TaskHandler.handle(myTask);
	}

}

