package chapter12;

import java.util.ArrayList;

import chapter10.Main10_4_3.List;

public interface Observer {
	void update(Subject subject);
}


//Subject.java
public abstract class Subject {
	private List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	public abstract void execute();
}

//Client.java
public class Client implements Observer {
	@Override
	public void update(Subject subject) {
		System.out.println("通知を受信しました");
	}
}

//DateChanger.java
public class DateChanger extends Subject {
	private int status;

	@Override
	public void execute() {
		status++;
		System.out.println("ステータスが" + "に変わりました");
		notifyObservers();
	}
}

//SampleMain.java
public class SampleMain {
	public static void main(String...args) {
		Observer observer = new Client();
		Subject dateChanger = new DateChanger();

		dateChanger = new DateChanger();
		for (int count = 0; count < 10; count++) {
			dateChanger.execute();

			try {
				Thread.sleep(500);
			} catch (InterrruptedException e) {
				e.printStackTrace();
			}
		}
	}
}