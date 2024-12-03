package collections;

import java.util.Map;

import java.util.stream.Collectors;

public class CountOccurrences {

	public static void main(String[] args) {
		String input = "karthik";
		
		
//		Map<Character, Long> collect = input.chars().mapToObj(x -> (char) x)
//				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//
//		collect.forEach((key, val) -> System.out.println(key + " : " + val));
		
		Map<Character, Long> count = input.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x ->x,Collectors.counting()));
		count.forEach((key,val) ->System.out.println(key +" : " +val));

	}
}
