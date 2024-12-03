package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoLists {

	public static void main(String[] args) {
		// Q18. Using streams, merge two lists of integers and remove duplicates.
				List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
				List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
		
				List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()).distinct()
						.collect(Collectors.toList());
				System.out.println(mergedList);

				
				
		// Q19. Write a stream operation to check if any string in a list starts with a specific prefix.
				List<String> info = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
				
				boolean anyMatch = info.stream().anyMatch(ele -> ele.startsWith("ap"));
				System.out.println(anyMatch);

				
				
		// Q20. Write a program to concatenate a list of strings into a single string,separated by commas, using streams.

				String mergedString = info.stream().collect(Collectors.joining(","));
				System.out.println(mergedString);

	}

}
