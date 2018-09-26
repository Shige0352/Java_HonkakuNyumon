package chapter14;


<?xml version= "1.0" encoding="UTF-8" ?>

<configuretion>

	<appender name="STDUNT" class="ch.gos.logback.core.ConsoleAppender">
		<encoder>
			<pattern>%date [%therad] %-5level{35} - %message%n</pattern>
		</encoder>
	</appender>

	<root level="INFO">
		<appender-ref ref="STDOUT" />
	</root>

</configuretion>


package ip.co.acroquest.java.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactry;

public calss LogbackSample {
	private static final Logger= LogerFactory.getlogger(LogbackSample.clss);

	public static void main(String[] args) {
		logger.info("アプリケーションを終了しました");

	}
}