package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		numbers.stream().map(n->n*n)
		.forEach(System.out::println);
		System.out.println("=========================");
		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("a","b"),Arrays.asList("c","d","e"));
		
		List<String> singleList = listOfLists.stream().flatMap(List::stream)
		.collect(Collectors.toList());
		//.forEach(System.out::println);
		
		System.out.println(listOfLists);
		System.out.println(singleList);
		
		
	}

}
