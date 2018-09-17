package chapter6;

import java.util.Arrays;

public class Main6_2_5 {

	public class ApplicationException extends Exception {
		public ApplicationException(String message) {
			suger(message);
		}

		public ApplicationException(String message, Throwable cause) {

		}

		public ApplicationException(Throwable cause) {
			super(cause);
		}

	}



	public class ApplicationException extends Exception {
		private String id;
		private Object[] params;

		public ApplicationException(String id, Object...params) {
			super();
			this.id = id;
			this.params = Arrays.copyOf(params, params.length);

		}

		public Application(String id, Trowable cause, Object...params) {
			this.id = id;
			this.params = Arrays.copyOf(params, params.length);

		}

		public String getId() {
			return id;
		}

		public Object[] getParams() {
			return Arrays.copyOf(params, params.length);
		}


	}

}
