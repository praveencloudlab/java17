package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		
		// Intermediate Operation
		
				Stream.of("d2","a2","b1","b3","c").filter(s->{
					System.out.println("Filter: "+s);
					return true;
				});
				
				
		// Terminal operation
		
		Stream.of("d2","a2","b1","b3","c").filter(s->{
			System.out.println("filter: "+s);
			return true;
		}).forEach(s->System.out.println("forEach: "+s));
		
		
		
		
		
		
		
		

	}

}
