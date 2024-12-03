package collections;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class InfiniteRandomNumbers {

	public static void main(String[] args) {
		// Q12. Create a stream to generate an infinite sequence of random numbers and print the first 10.
		
			Stream.generate(() -> new Random().nextInt()).limit(10).forEach(n -> System.out.print(n + " "));

			
	}

}
