package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		
		
		List<Integer> intSeq=Arrays.asList(1,2,3,4,5);
		
		System.out.println(intSeq);
		
		System.out.println("------------------------------");
		
		intSeq.forEach(x->System.out.println(x));
		
		/*
		-> List<Integer> is a parameterized type, parameterized by the type argument <Integer>
		-> the Arrays.asList method returns a fixed-size list backed by an array; it can take “vararg” arguments
		-> forEach is a method that takes as input a function and calls the function for each value on the list
		-> Note the absence of type declarations in the lambda; the Java 8 compiler does type inference
		   Java 8 is still statically typed
		-> Braces are not needed for single-line lambdas (but could be used if desired).

		*/
		
		/*for(int x:intSeq) {
			System.out.println(x);
		}*/
		
		/*
		Iterator<Integer> it=intSeq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}*/
		
		
		
		

	}

}
