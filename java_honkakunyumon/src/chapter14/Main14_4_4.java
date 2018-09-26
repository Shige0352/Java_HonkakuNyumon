package chapter14;


<?xml version="1.0" encoding="UTF-8" ?>


<configuretion>

	<appender name="FILE" class="ch.gos.logback.core.rolling.RollingFileAppender">
		<file>log/logest.log</file>
		<rollingPolicy class="ch.gos.logback.core.rolling.TimeBaseRollingPolicy">
			<fileNamePattern>logs/logest.%d{yyyy-MM-dd}.log</fileNamePattern>
			<maxHistory>30</maxHistory>
			</rollingPolicy>
		<encoder>
			<pattern>%date [%therad] %-5level{35} - %message%n</pattern>
		</encoder>
	</appender>

	<root level="INFO">
		<appender-ref ref="STDOUT" />
	</root>

</configuretion>