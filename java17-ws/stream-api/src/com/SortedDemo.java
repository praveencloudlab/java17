package com;

import java.util.stream.Stream;

public class SortedDemo {
	
	public static void main(String[] args) {
		
		Stream<String> names = Stream.of("Eva","Anna","Carl","Bob");
		
		names.sorted()
		.forEach(System.out::println);
		
		
	}

}
