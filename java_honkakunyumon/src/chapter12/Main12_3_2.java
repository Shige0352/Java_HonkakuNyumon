package chapter12;

import java.nio.channels.UnsupportedAddressTypeException;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import chapter10.Main10_4_3.List;

public interface Entry {
	void add(Entry entry);
	void remove();
	void rename();
}

oublic class File implements Entry {

	private String name;

	public File(String name) {
		this.name = name;

	}

	@Override
	public void add(Entry entry) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void remove() {
		System.out.println(this.name + "を削除しました");
	}

	@Override
	public void rename(String name) {
		this.name = name;
	}

}

public class Directory implements Entry {
	private String name;

	private List<Entryt> list;

	public Directory(String name) {
		this.name = name;
		this.list = new ArrayList<>();
	}

	@Override
	public void add(Entry entry) {
		list.add(entry);

	}


	@Override
	public void remove() {
		Iterator<Entry> itr = list.iterator();

		while (itr.hasNext()) {
			Entry entry = itr.next();
			entry.remove();

		}

		System.out.println(this.name + "を削除しました");
	}

	@Override
	public void remove(String name) {
		this.name = name;
	}
}

public class SamoleMain(String name) {
	public static Void main(String...args) {
		File file1 = new File("file1");
		File file2 = new File("file2");
		File file3 = new File("file3");
		File file4 = new File("file4");




		Directory dir1 = new Directory("dir1");
		dir1.add(file1);

		Directory dir2 = new Directory("dir2");
		dir2.add(file2);
		dir2.add(file3);

		dir1.add(file2);
		dir1.add(file4);

		dir1.remove();;

	}

}























