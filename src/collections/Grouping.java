package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

	
	// Given a list of strings, we need to group them by their length using Java
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("a", "bb", "ccc", "dd", "eee", "ffff", "ggggg");
		Map<Integer, List<String>> groupingByLength = strings.stream().collect(Collectors.groupingBy(s -> s.length()));
		groupingByLength.forEach((key,val) -> System.out.println(key+" : "+val));

	}

}
