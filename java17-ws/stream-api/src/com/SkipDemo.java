package com;

import java.util.stream.Stream;

public class SkipDemo {
	
	public static void main(String[] args) {
		
		// skip :: Returns a stream skipping the first n elements
		
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		
		numbers
		.skip(2) 
		.forEach(System.out::println); // displays 3 4 and 5
		
		
	}

}
