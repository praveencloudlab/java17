package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaDemo4 {

	public static void main(String[] args) {
		
		
		List<Integer> intSeq=Arrays.asList(1,2,3,4,5);
				
		intSeq.forEach((Integer x)->{
			int y=x+20;
			System.out.println(y);
		});
		

		/*
		 -> You can, if you wish, specify the parameter type
		 -> The compiler knows the type of intSeq is a list of Integers
		 -> Since the compiler can do type inference, you don’t need to specify the type of x.

		 */

	}

}
