package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaDemo2 {

	public static void main(String[] args) {
		
		
		List<Integer> intSeq=Arrays.asList(1,2,3,4,5);
		

		
		intSeq.forEach(x->{
			x=x+20;
			System.out.println(x);
		});
		
		// -> Note: braces are needed to enclose a multiline lambda expression
	}

}
