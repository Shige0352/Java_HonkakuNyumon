package chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main5_2_1 {
	List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");
	Stream<String> stream = list.stream(); //streamの作成
	Stream.forEach(System.out.println); //各要素の出力
}
