package chapter4;

import java.util.HashMap;
import java.util.Map;

public class Main4_4_2 {

	Map<String, Integer> scores = new HashMap<>();
	scores.put("Ken", 100);
	scores.put("Shin", 80);
	scores.put("Takuya", 60);
	System.out.println("Mapの中身：" + scores.toString());

	scores.put("Shin", 50);
	Syetem.out.println("Mapの中身" + scores.toString());

	Integer takuyaScore = scores.get("Takuya");
	System.out.println("Takuyaの中身" + takuyaScore.toString());

	scores.remove("Shin");
	System,out.println("Mapの中身" + scores.toString());

	int size = scores.size();
	System.out.println("要素の数", size);

	boolean existken = scores.containsKey("ken");
	system.out.pritnln("Kenの存在" + existKen);

	boolean exist80 = scores.containsValue(80);
	System.out.println("80点の存在" + exist80);

}
