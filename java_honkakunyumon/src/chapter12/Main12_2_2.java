package chapter12;

public interface Builder {
	void createHeader();
	void createContents();
	void createFooter();
	Page getResult();



}

public class Page {
	private String header;

	private String contents;

	private String footer;

	//setter getterは省略
}

public class TopPage extends Page {
	//内容はPaegと一緒
}

public class Directer {
	private Builder builder;

	public Directory(Builder builder) {
		this.bilder = builder;
	}

	public Page construct() {
		builder.createHeader();
		builder.createContents();
		builder.createFooter();

		return builder.getResult();

	}
}


public class TopPageBuilder implements Builder {
	private TopPage page;

	public TopPageBuilder() {
		this.page = new TopPage();

	}

	@Override
	public void createHeader() {
		this.page.setHeader("Header");

	}


	@Override
	public void createContents() {
		this.page.setContents("Contents");

	}


	@Override
	public Page getResult() {
		return this.page;


	}
}

public class SampleMain {
	public static void main(String...args) {
		Builder builder = new TopPageBuilder();
		Director director = new Directer(builder);

		Page page = director.construct();

	}
}




































