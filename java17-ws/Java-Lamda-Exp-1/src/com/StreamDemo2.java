package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		List<String> myList=Arrays.asList("a1","a2","come","cargo","cap");
		
		/*
		 * 1. Sequential streams
		 * 2. Parallel streams
		 */
		
		myList.stream().findFirst().ifPresent(System.out::println); // a1
	
		/*
		 * Notes:
		 * -> Calling the method stream() on a list of objects returns a regular object stream
		 * -> Just use Stream.of() to create a stream from a bunch of object references
		 * 
		 * Stream Ranges
		 * ---------------
		 * 	-> IntStream
		 * 	-> LongStream
		 * 	-> DoubleStream
		 * 
		 */
		
		Stream.of("a1","a2","a3").findFirst().ifPresent(System.out::println);
		
		// Stream Ranges
		
		//IntStream.range(1, 10).forEach(System.out::println);
		//LongStream.range(100, 150).forEach(System.out::println);
		//DoubleStream.of(10.4,20.5).forEach(System.out::println);
		
		// Aggregate functions -> return/result always only one value
		//-> sum() and average()
		
		Arrays.stream(new int[] {1,2,3}).map(n->2*n+1).average().ifPresent(System.out::println);
		
		// Transform a regular object stream to a primitive streams or vice versa
		// -> mapToLong(), mapToInt() and mapToDouble()
		
		
		//Stream.of("a1","a2","a3").map(s->s.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
		
		// Primitive streams also can be transformed to object streams via mapToObj()
		
		IntStream.range(1, 4).mapToObj(i->"a" + i).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		

	}

}
