package chapter12;

public class OldSystem {
	public void oldProcess() {
		//既存処理
	}


	public interface Target {
		void process();

	}


	public class Adapter extends OldSystem implements Target {
		@Override
		public void process() {
			oldProcess();

		}

	}
	public class SampleMain {
		public static void main(String...args) {
			Target target = new Adapter();
			target.process();

		}
	}

}


public class OldSystem {
	public void oldProcess() {
		//既存処理
}


public abstract class Terget {
	abstract void process();
}


public class Adapert extends Target {
	private OldSystem oldSystem;

	public Adapter() {
		this.oldSystem = new OldSystem();

	}

	@Override
	public void process() {
		Target target = new Adpter();

	}
}



public class SampleMain {
	Target target = new Adpter();
	target.process();

}















































