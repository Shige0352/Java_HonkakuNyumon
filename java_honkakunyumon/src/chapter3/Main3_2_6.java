package chapter3;

import java.io.File;
import java.util.List;

public class Main3_2_6 {
	public abstract class AbstractItem {

		protected String name;

		public AbstractItem(String name) {
			this.name = name;

		}

		public abstract void print(String parentPath); //抽象メソッド、子クラスで実装する
	}

	public class FileItem extends AbstractItem {
		public FileItem(String name) {
			super(name);
		}

		@Override

		public void print(String parentPath) { //親クラスのAbstractメソッドをオーバーライドする

			System.out.println(parentPath + File.separator + name);

		}
	}

	public class DirectoryItem extends AbstractItem {
		private List<AbstractItem> children;

		public DirectoryItem(String name, List<AbstractItem> childrem) {
			super(name);
			this.children = children;
		}


		@Override
		public void print(String parentPath) {
			for (AbstractItem Child : children) {
				child.print(parentPath + File.separator + name);

				}
			}
		}
	}

}
