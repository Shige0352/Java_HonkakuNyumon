package chapter12;

import java.sql.Connection;

import javax.security.auth.login.Configuration;

public interface Factory {
	Connection getConnection();

	Configuration getCongiguration();


}


public abstract class Connection {
	//任意の処理
}

public abstract class Connection {
	//任氏の処理

}

public class PostgreSQLFactory {
	@Override
	public Connection getConnection() {
		return new PostgresSQLConnection();

	}

	@Override
	public Congiguration getConfiguration() {
		return new PostgreSQLConfiguration();

	}

	public class PostgreSQLConnection extends Connection {
		//PostgreSQLのコネクション処理

	}
	public class PostgreSQLConfiguration extends Configuration {
		//PostgreSQLの設定情報の読み込み
	}

	public class MySQLFactory implements Factory {
		@Override
		public Connection get Connection() {
			return new MySQLConnection();
		}

		@Override
		public Configuration getConfiguration() {
			return new MySQLConfiguration();
		}
	}

	public class MySQLConnection extends Connection {
		//MySQLのコネクション処理
	}

	public class MySQLConfiguration extends Configuration {
		//MYSQｌの設定情報の処理

	}

	public class SampleMain {
		public static void main(String...args) {
			String env = "PostgerSQL";

			Factory factory = createFactory(env);
			Connection connection = factory.getConnection();
			Configuration configuration = factory.getConfiguration();

		}

		private static Factory createFactory(String env) {
			switch (env) {
			case  "PostgreSQL":
				return new PostgreSQLFactory();

			case "MySQL":
				return new MySQLFactory();

			default:
				throw new IllegalArgumentException(env);

			}
		}
	}
}






































