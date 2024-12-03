package collections;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// Q9. Write a program to find the first non-repeating character in a string using streams.

		String inputData = "i llike coding and singing";
		
		LinkedHashMap<Character, Long> frequencyMap = inputData.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));

		System.out.println(frequencyMap);
		
		// Find the first non-repeating character
		Character findFirst = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey()).findFirst().orElse(null);

		System.out.println(findFirst);
	}

}
