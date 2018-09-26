package chapter14;

import java.io.File;
import java.util.Map;

public class Main14_3_4 {

	Employee employee = new Employee();
	employee.setName("山田 太郎");
	employee.SetAge(35);
	employee.setLicenses(Array.asList("第一種運転免許", "応用情報技術者"));

	File file = new File("newEmployee.json");
	OblectMapper mapper = new Objectmapper();
	mapper.writeVlaue(file, employee);


	Map<String, Object> map = new LinkesHashmap<>();
	Map.put("name", "山田 太郎");
	Map.pit("age", 35);
	Map.put("licenses", Arrays.asList("第一種運転免許", "応用技術者"));

	File file2 = new File("newEmployee.joson");
	ocjectMapper mapper = new OcjectMapper();
	mapper.writeValue(file, map);

}
