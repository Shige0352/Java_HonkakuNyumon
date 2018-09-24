package chapter12;

public abstract class Command {
	protected Book book;

	public void setBook(Book book) {
		this.book = book;
	}

	public abstract void execute();
}


//book.java

public class Book {
	private double amount;

	public Book(double amount) {
		this.amount = amount;

	}

	public double getAmount() {
		return this.amount;

	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}



//DiscountCommand.java

public class DiscountCommand extends Command {
	@Override
	public void execute() {
		double amount = book.getAmount();
		book.setAmount(amount * 0.9);
	}
}


//SpecialDiscountCommand.java

public class SpecialDiscountCommand extends Command {
	@Override
	public void execute() {
		double amount = book.getAmount();
		book.setAmount(amount * 0.7);
	}
}


//SampleMain.java

public class SampleMain {
	public static void main(String...args) {
		//500円コミック
		Book comic = new Book(500);

		//2500円の技術書
		Book technicalBook = new Book(2500);

		//割引価格計算用コマンド
		Command discountCommand = new DiscountCommand();

		//特別割引価格計算用コマンド
		Command specialDiscountCommand = new SpecialDiscountCommand();


		//コミックに、割引適用
		discountCommand.setBook(comic);
		discountCommand.execute();
		System.out.println("割引後金額は、" + comic.getAmount() + "円");


		//コミックに、割引適用
		discountCommand.setBook(technicalBook);
		discountCommand.execute();
		System.out.println("割引後金額は、" + technicalBook.getAmount() + "円");

		//コミックに、割引適用
		specialDiscountCommand.setBook(technicalBook);
		specialDiscountCommand.execute();
		System.out.println("割引後金額は、" + technicalBook.getAmount() + "円");

	}
}




































