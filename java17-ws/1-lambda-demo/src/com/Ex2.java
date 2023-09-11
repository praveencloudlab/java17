package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex2 {
	
	public static void main(String[] args) {
		
		
		List<String> data = Arrays.asList("Test","Monkey","Bob","Amd","Cmg");
		
		System.out.println(data);
		System.out.println("----------------");
		Collections.sort(data,(obj1,obj2)->obj1.compareTo(obj2));
		
		System.out.println(data);
		
		
		
	}

}
