package chapter12;

//sttategy.java
public interface Strategy {
	void discount(Book book);

}


//Book.java
public class Book {
	private double amount;

	public Book(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return this.amount;

	}

	public void steAmount(double amount() {
		this.amount = amount;
	}
}



//DiscountStrategy.java
public class DiscountStrategy implements Strategy {
	@Override
	public void discount(Book book) {
		double amount = book.getAmount();
		book.setAmount(amount * 0.9);

	}
}


//SpecialDiscountStrategy.java
public class SpecialDiacountStrategy implements Strategy {
	@Override
	public void discount(Book book) {
		double amount = book.getAmount();
		book.setAmount(amount * 0.7);
	}
}


//Shop.java
public class Shop {
	private Strategy strategy;

	public Shop(Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}


	public void sell(Book book) {
		this.strategy.discount(book);
	}
}


//SampleMain.java

public class SampleMain {
	public static void main(String...args) {


		//500円のコミック
		Book comic = new Book(500);

		//2500円の技術書
		Book technicalBook = new Book(2500);

		//割引価格計算用ストラテジー
		Strategy discountStrategy = new DiscountStrategy();

		//特別価格計算用ストラテジー
		Strategy specialDiscountStrategy = new SpecialDiacountStrategy();

		//コミックに割引を適用
		Shop shop = new Shop(discountStrategy);
		shop.sell(comic);
		System.out.println("割引後の金額、" + comic.getAmount() + "円");

		//技術書に特別価格を適用
		shop.setStrategy(discountStrategy);
		shop.sell(technicalBook);
		System.out.println("割引後の金額、" + technicalBook.getAmount() + "円");


	}
}



































































