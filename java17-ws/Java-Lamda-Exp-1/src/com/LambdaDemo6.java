package com;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo6 {

	public static void main(String[] args) {
		
		List<Integer> intSeq=Arrays.asList(1,2,3,4);
		
		int var=10;
		
		intSeq.forEach(x->System.out.println(x+var));
		
		/*
		 -> Note: local variables used inside the body of a lambda must be final or effectively final
		 -> This lambda “captures” the variable var.
		 
		 */
		
	}

}
