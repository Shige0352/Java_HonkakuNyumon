package chapter14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore.TrustedCertificateEntry;
import java.sql.Date;

import javax.lang.model.type.PrimitiveType;
import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.Counter;
import org.w3c.dom.css.RGBColor;
import org.w3c.dom.css.Rect;

//Employeeクラス
public class Employee {
	private String name;
	private Integer age;
	private Date birth;
	private String emali;
	private String note;

	//setter getter は省略
}

// CellProcessorクラス
CellProcessor[] processors = new CellProcessor[] {
		new NotNull(),
		new ParseInt(new NotNull()),
		new ParseDate("yyyy/MM/dd"),
		newStrRegEX("[a-z0-9\\._]+@[a-zo9\\.]+"),
		new Optional()
};

Path path = Paths.get("employee.csv");
try (IcsvBeanReader beanReader = new CsvBeanReader(Files.neaBufferReader(path),
		csvPrefence.STANDARD_PREFENCE)) {
	Strung[] header = beanReader.getHeader(true);
	Employee employee;
	while ((employee = beanReader.read(Employee.class, header, processors)) != null) {
		//employeeに対する処理
	}
}