package collections;

import java.util.List;
import java.util.stream.Collectors;

public class FlattenMap {

	public static void main(String[] args) {
		// Q6. Write a stream operation to flatten a list of lists of integers into a single list of integers.

		List<List<Integer>> listOfLists = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
		
		List<Integer> list = listOfLists.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
		
		System.out.println(list);
	}

}
