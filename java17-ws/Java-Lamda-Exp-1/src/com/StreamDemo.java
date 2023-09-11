package com;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<String> myList=Arrays.asList("a1","a2","come","cargo","cap");
		System.out.println(myList);
		
		//myList.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
		//myList.stream().forEach(System.out::println);
		myList.stream().filter(s->s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
		
		
		
		
		
		//System.out.println(myList.size());
		
		
		
		
		
		
		
		
		

	}

}
