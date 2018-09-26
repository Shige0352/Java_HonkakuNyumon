package chapter14;

//保存するデータ
List<Employee> employeeList = Collections.emptyList();

//csvデータへのヘッダー
String[] header = new String[]{"name", "age", "birth", "email", "note"};

//項目を制約を定義する
CellProcessor[] processors = new CellProcessor[] {
		new NotNull(),
		new NotNull(),
		new FmtDate("yyyy/MM/dd"),
		new NotNull(),
		new Optional(),
};

Path path = Paths.get("employee.csv");
try (ICsvBeanWriter baenWriter = new CsvBeanWriter(Diles.newBufereWriter(path),
		CsvPreference.STANDARD_PREFERENCE)) {
	beanWriter.writerHeader(header);
	for (Employee employee : employeeList) {
		beanWriter.write(empolyee, header, processors);
	}
}