package com;

import java.util.Arrays;
import java.util.List;

public class SequencialStreamDemo {
	
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("John","Jane","Doe","Smith");
		names.stream().forEach(System.out::println);
		
		System.out.println("--------------");
		//Parallel Streams
		
		names.parallelStream().forEach(System.out::println);
		
		
	}
	

}
