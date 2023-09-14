package com;

import java.util.stream.Stream;

public class LimitDemo {
	
	public static void main(String[] args) {
		
		// limit :: Returns a stream that's no longer  than the given size
		
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		numbers.limit(4)
		.map(n->n+100)
		.forEach(System.out::println);
		
		
		
	}

}
