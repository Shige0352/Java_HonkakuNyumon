package chapter14;

import java.io.File;

import chapter10.Main10_4_3.List;

public class employee {
	private String name;
	private Integer age;
	private List<String> licenses;

}

File file = new File("employee.jason");
ObjectMapper mapper = new ObjectMapper();
Employee employee = mapper.readValue(file, Employee.class);

Msp<?, ?> mapper.readValue(file, Map.class);
System.out.println(map.get("name"));
System.out.println(map.get("age"));
System.out.println(((List<?>map.get("licenses")).get(0));
System.out.println(((List<?>map.get("licenses")).get(1));
