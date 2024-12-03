package collections;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthofStrings {

	public static void main(String[] args) {
		//Q5. Using Java Streams, convert a list of strings to a map where the key is the string and the value is its length.

		List<String> data = List.of("apple", "banana", "cherry", "date");
		
		Map<String, Integer> listOfStrings = data.stream().collect(Collectors.toMap(x ->x, x-> x.length()));
		
		listOfStrings.forEach((key, value) -> System.out.println(key + ": " + value));
	}

}
