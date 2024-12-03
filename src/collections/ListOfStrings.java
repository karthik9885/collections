package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfStrings {

	public static void main(String[] args) {
	// Q14. Write a program to convert a list of strings to a list of their respective lengths using streams.

		List<String> info = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
		
		List<Integer> lengths = info.stream().map(ele -> ele.length()).collect(Collectors.toList());
		System.out.println("Lengths of strings: " + lengths);
		
		Map<String, Integer> list = info.stream().collect(Collectors.toMap(x->x, x->x.length()));
		list.forEach((key,val) -> System.out.println(key +" : " + val));
		
	// Q16. Create a stream pipeline to collect all unique words from a list of sentences.
				List<String> sentences = Arrays.asList("the quick brown fox", "jumps over the lazy dog", "and the lazy cat");
				List<String> uniqueWords = sentences.stream().flatMap(lis -> Arrays.stream(lis.split(" "))).distinct().collect(Collectors.toList());
				System.out.println("Unique Words are "+uniqueWords);
				
	// Q17. Write a program to filter out null values from a list of strings using streams.
				List<String> nullStrings = Arrays.asList("apple", null, "banana", "orange", null, "grape", "kiwi");
				List<String> removeNULLString = nullStrings.stream().filter(ele -> ele != null).collect(Collectors.toList());
				System.out.println("Strings without nulls "+removeNULLString);
	}

}
