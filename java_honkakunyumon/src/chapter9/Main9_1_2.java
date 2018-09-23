package chapter9;

import java.util.Calendar;

public class Main9_1_2 {
	Calendar calendar = Calender.getInstance();
	System.out.println("...");
	System.out.println(calender);
	System.out.println("...");
	System.out.println(cakender.getTime());

	Calendar calendar = Calendar.getInstance();
	//分だけ指定する
	calendar.set(calenddar.MINUTE, 18);
	System.out.println("分の指定:" + calendar.getTime());

	//全部しているする（つきは）0~11であらわすこと
	Calendar.set(2013, 9, 22, 18, 36, 42);
	System.out.println("全部指定:" + calendar.get(Calendar.DATE()));

	//費を表示する
	System.out.println("日の表示: " + calendar.get(Calendar.SECOND));

	// 秒を表示する
	System.out.println("秒を表示する" + calendar.get(Calendar.SECOND));

	//年を2追加する(2年後の日時に変更する)
	Calendar.add(Calendar.YEAR, 2);
	System.out.println("年の追加: " + calendar.getTime());

	//月を2減らす(2か月前の日時に変更する
	Calendar.add(Calendar.MONTH, -2);
	System.out.println("月の減算" + calendar.getTime());




}
