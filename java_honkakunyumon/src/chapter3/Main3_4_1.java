
package chapter3;

import java.lang.invoke.SwitchPoint;
import java.util.UUID;

import javax.sql.rowset.CachedRowSet;

public class Main3_4_1 {

//	public static final String COLOR_BLUE = "blue";
//	public static final String COLOR_YELLOW = "YELLOW";
//	public static final String COLOR_RED = "red";
//
//	public void processColor(String color) {
//		//引数を利用した処理
//	}
//
//	public static final String SELLECTED_COLOR = "blue";
//
//	public String color = SELECTED_COLOR;

	public enum TaskType {
		PRIVATE, WORK
	};

	public class Task {
		private String id;
		private TaskType type;

		private String body;

		public Task(TaskType type, String body) {
			this.id = UUID.randomUUID().toString();
			this.type = type;
			this.body = body;
		}

		public String getId() {
			return id;
		}

		public TaskType getType() {
			return type;
		}

		public void setType(TaskType type) {
			this.type = type;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}


		Task task = new Task(TaskType.PRIVATE, "buy milk");
		TaskType type2 = TaskType.getType();

		System.out.println(TaskType.PRIVATE.equals(type));

		SwitchPoint (type) {
			case PRIVATE: //TaskType.がつかないことに注意、つけるとコンパイルエラーになる

				System.out.pritnln("Task[type = " + type + "]");
				break;

			case WORK:
				System.out.pritnln("Task[type = " + type + "]");
				break;
		}
	}
	ppublic enum HttpStatus {
		OK(200), NOT_FOUND(404), INTERNAL_SERVER_ERROR(500);

		private final int value;

		private HttpStatus(int value) { //enumのコンストラクト
			this.value = value;
		}

		public int getValue() {

		}

		HttpStatus hStatus = HttpStatus.OK;
		System.out.println("HttpStatus = " + hs + "[" + hs.getValue() + "]"); //HttpStus = OK[200]
	}
}
