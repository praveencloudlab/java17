package com;

import java.util.Arrays;
import java.util.List;

public class PeekDemo {
	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("one","two","three");
		
		strings.stream()
		.peek(System.out::println)// produces a stream consisting of the elements of the original stream
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		
		

	}
}
