package collections;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TransactionFilter {

	public static void main(String[] args) {
		// Q7. Given a list of transactions, filter out transactions of a specific type and collect them into a set.

				List<Transaction> transactions = List.of(new Transaction("deposit", 100.0), new Transaction("withdrawal", 50.0),
						new Transaction("deposit", 200.0), new Transaction("withdrawal", 30.0),
						new Transaction("transfer", 75.0));
				
				Set<Transaction> filteredTransactions = transactions.stream().filter(x -> x.getType().equals("deposit"))
						.collect(Collectors.toSet());
				filteredTransactions.forEach(ele -> System.out.println(ele));

	}

}
