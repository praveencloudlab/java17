package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LamdaDemo3 {

	public static void main(String[] args) {
		
		
		List<Integer> intSeq=Arrays.asList(1,2,3,4,5);
				
		intSeq.forEach(x->{
			int y=x+20;
			System.out.println(y);
		});
		
// -> Note: Just as with ordinary functions, you can define local variables inside the body of a lambda expression

	}

}
