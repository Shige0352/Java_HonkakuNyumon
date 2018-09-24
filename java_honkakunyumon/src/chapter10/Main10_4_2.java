package chapter10;

import java.util.List;

import chapter10.Main10_4_2.UserCsvColumn;
import chapter3.Main3_3_1.BaseService;

public class Main10_4_2 {

	public class UserCsvColumn {
		public static final int NAME = 0;
		public static final int ADDRESS = 1;
		public static final int MAIL = 2;
	}

}


public class CsvProcessor {


	public void processColumn(int column) {


		if (column == NAME)
		{
			}
		}
}



public interfece UserManagementService {
	void register(User user);
	List<UserDo> list();
	void delete(Integer userId);
}

public abstract class AbstractUserManagementService implements UserManagementService {
	protected UserDto convertFrom(User user) {
		//UserクラスからUserDtoクラスへの変換処理

	}
}

public class HttpUserManagementService extends AbstractUserManagementService {
	public List<UserDto> list() {
		//convertFromを使用した処理

	}
}


public class DatabaseUserManagementService extends AbstractUserManagementService {
	public List<UserDto> list() {
		//convertFromを使用した処理
	}
}

public class AService {
	protected BaseService service;


	public void someMethod() {
		service.execute();
	}
}