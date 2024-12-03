package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class HighestSalary {

	public static void main(String[] args) {
		// Q3. Given a list of Employee objects, find the employee with the highest
		// salary using streams.
		
		List<Employee> employees = Arrays.asList(new Employee("Alice", 60000), new Employee("Bob", 70000),
				new Employee("Charlie", 80000), new Employee("David", 75000));
		
		Optional<Employee> emp = employees.stream().max((e1,e2) -> Double.compare(e1.getSalary(),e2.getSalary()));

		System.out.println(emp.get());
	}

}
