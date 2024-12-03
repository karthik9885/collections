package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OldestPerson {

	public static void main(String[] args) {
		// Q8. Create a stream pipeline to find the first name of the oldest person in a list of Person objects.
		
		List<Person> people = Arrays.asList(new Person("John", "Doe", 70), new Person("Jane", "Smith", 40),
				new Person("Alice", "Johnson", 50), new Person("Bob", "Brown", 60));
		
		Optional<Person> maxAge = people.stream().max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
		System.out.println(maxAge.get().getFirstName());
	}

}
