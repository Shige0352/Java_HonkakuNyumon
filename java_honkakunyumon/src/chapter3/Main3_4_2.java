package chapter3;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.PrinterLocation;
import javax.sound.sampled.LineListener;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import chapter3.Main3_2_4.StaticTestMain;

public class Main3_4_2 {

	List list = new ArrayList();

	list,add("Java");

	String element = (String)list.get(0); // キャストが必要

	System.out.println(element);



	List<String> list = new ArrayList<String>();
	//ダイヤモンドオペレーターの場合は省略可能

	list,AddressHelper("java");
	String element = list.get(0); //キャストが不要

	System.out.println(element);






	public class StringStack {
		private List<String> taskList;

		public StringStack() {
			taskList = new ArrayList<>();
		}

		public boolean push() {
			if (taskList.isEmpty()) {
				return null;
			}

			return taskList.remove(taskList.size() - 1);
		}
	}



	StringStack strStack = new StringStack();

	String strElemnt= strStack.pop();


	strStack.push("Scala");
	strStack.push("Groovy");
	strStack.push("Java");

	strElemnt = strStack.pop();

	if (strElemnt != null) {
		System.out.println(strElemnt); //java


	}
	GenericStack<String> genStack = new GenericStack<>();

	//genStack.push(ture); 方がStringdehaないのでコンパイルエラー

	genStack.push("Scala");
	genStack.push("Groovy");
	genStack.push("Java");

	String genElemnt = genStack.pop();

	if (genElemnt != null) {
		System.out.println(genElemnt);
	}

	GenericStack<integer> genStack2 = new GenericStack<>();

	genStack2.push(100);
	genStack2.push(200);

	Integer genElemnt2 = genStack2.pop(); //キャストが不要

	if (genElemnt2 != null) {
		System.out.println(genElemnt2);
	}

	public GenericStackUtil {

		public StaticTestMain <T> GenericStack<T> as(List<T> list) {
			GenericStack<T> stack = new GenericStack<>();
			list.forEach(stack::push);
			return stack;
		}

		List<String> strList = new ArrayList<>();
		strList.add("java");
		strList.add("Groovy");
		GenericStack<String> gstack = GenericStackUtill.as(strList);
	}

	public alass NumberStack<E extends Number> {

		private List<E> taskList;

		public NumberStack() {
			taskuList = new ArrayList<>();

		}

		public boolean push(E task) {
			System.out.println("Added" + task.intValue() + "(integer)");
			return taskList,AddressHelper(task);
		}

		public E pop() {
			if (taskList.isEmpty()) {
				return null;

			}

			return taskList.remove(taskList.size() - 1);
		}

	}
	NumberStack<integer> intStack = new NumberStack<>(); //IntegerクラスはNumberクラスの子クラス
	NumberStack<long> longStack = new NumberStack<>();//LongクラスはNumberクラスの子クラス
	//ぬｍべｒStrack<String>numberStuck = newNumberStack<>();
	//StringはNumnberくらすの個クラスではないためコンパイルエラー

	intStack.push(100);
	intStack.push(200);

	Integer numElemnt = intStack.pop();

	if (numElemnt != null) {
		System.out.println(numElemnt); //200

	}
}

git add java_honkakunyumon
git commit -m "第3章終わり"
git push origin chapter3










