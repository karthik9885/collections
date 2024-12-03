package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfSquares {

	public static void main(String[] args) {
		// Q10. Using streams, find the sum of the squares of a list of integers.

			List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
			
			int squares = numberList.stream().mapToInt(n -> n * n).sum();
			System.out.println("Sum of Squares is " + squares);
			
			// Q11. Write a stream operation to skip the first 5 elements in a list and then print the rest.
			
			numberList.stream().skip(5).forEach(x -> System.out.print(x+ " "));

			
			// Q13. Using streams, partition a list of integers into even and odd numbers.
			
						Map<Boolean, List<Integer>> partitionList = numberList.stream()
								.collect(Collectors.partitioningBy(ele -> ele % 2 == 0));
						List<Integer> evenNumbers = partitionList.get(true);
						List<Integer> oddNumbers = partitionList.get(false);

						System.out.println("Even numbers: " + evenNumbers);
						System.out.println("Odd numbers: " + oddNumbers);
						
				// Q15. Using streams, find the product of all elements in a list of integers.
						Integer product = numberList.stream().reduce(1, (x, y) -> x * y);
						System.out.println("Product is "+product);
						
	}

}
