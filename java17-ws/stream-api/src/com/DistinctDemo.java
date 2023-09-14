package com;

import java.util.stream.Stream;

public class DistinctDemo {
	
	public static void main(String[] args) {
		
		
		Stream<Integer> numbers = Stream.of(10,2,2,3,4,4,5,10);
		
		numbers.distinct()
		.forEach(System.out::println);
		
		
	}

}
