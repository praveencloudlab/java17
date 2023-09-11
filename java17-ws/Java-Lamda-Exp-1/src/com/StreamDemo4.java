package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo4 {

	public static void main(String[] args) {
		
		
		
		/*Stream.of("d2","a2","b1","b3","c").map(s->{
			System.out.println("map: "+s);
			return s.toUpperCase();
		}).anyMatch(s->{
			System.out.println("anymatch: "+s);
			return s.startsWith("A");
		});*/
		
		
		// Order matters
		
	/*	Stream.of("d2","a2","b1","b3","c").map(s->{
			System.out.println("map: "+s);
			return s.toUpperCase();
		}).filter(s->{
			System.out.println("filter: "+s);
			return s.startsWith("A");
		}).forEach(s->System.out.println("forEach: "+s));*/
		
		
		Stream.of("d2","a2","b1","b3","c").sorted((s1,s2)->{
			System.out.printf("sort %s; %s\n",s1,s2);
			return s1.compareTo(s2);
		}).filter(s->{
			System.out.println("filter: "+s);
			return s.startsWith("a");
		}).map(s->{
			System.out.println("map: "+s);
			return s.toUpperCase();
		}).forEach(s->System.out.println("forEach: "+s));
		
		
		
		
		
		
		
		

	}

}
