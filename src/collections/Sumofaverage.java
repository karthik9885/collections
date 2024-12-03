package collections;

import java.util.Arrays;
import java.util.List;

public class Sumofaverage {

	public static void main(String[] args) {
		// Q4. Using streams, filter a list of numbers to only include those greater than 10 and then find their average.

		List<Integer> numbers = Arrays.asList(5, 15, 20, 25, 30, 3, 8, 10);
		
		double average = numbers.stream().filter(n -> n>10).mapToInt(n -> n).average().orElse(0);
	
		System.out.println(average);
	}

}
