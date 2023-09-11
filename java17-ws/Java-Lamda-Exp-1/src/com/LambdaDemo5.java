package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo5{
	
	public static void main(String[] args) {
	
		List<Integer> intSeq=Arrays.asList(10,20,30,40);
		Consumer<Integer> cnsmr=x->System.out.println(x);
		intSeq.forEach(cnsmr);
		
		
		/*
		-> Here is an interface called Consumer with a single method called accept.
		-> The forEach method iterates through the items in the object Consumer and performs the action accept on each item.
		-> The lambda expression becomes the body of the function in the interface.
		-> The signature of the function is defined by the interface.

		 */
		
		
	}
	
	
	

}
