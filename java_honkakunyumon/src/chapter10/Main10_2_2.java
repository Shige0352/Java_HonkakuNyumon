package chapter10;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main10_2_2 {

	public class XxxDateLoader {
		private String fileName;

		private List<String> load() thows IOException {
			List<String> lines = Files.readAllLines(Paths.get(this.fileName));
			return lines;
		}


		///

	}


	public class YyyDateLoader extends XxxDateLoader {
		//コンパイル鰓ーになる
		//protected List<String> load() thows IOexception {


}


	public class XxxDateLoader {
		protected String fileName; //修飾子変更


		protected List<String> load() thows IOException {
			List<String> lines = Files.readAllLines(Paths.get(this.fileName));
			return lines;
		}



		public class XxxDateloaderTest {

			@Test
			public void testLoad() {

				XxxDataloader loader = new XxxDataLoader();


				loader.fileName = "sample.text";
				List<String> result;
				try {
					result = loader.load();

					...

				}
			}
		}
