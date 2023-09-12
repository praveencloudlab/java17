package com;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
	
	public static void main(String[] args) {
		
		List<String> data = Arrays.asList("A","B","C");
		
		//data.forEach(str->{
		//	System.out.println(str);
		//});
		
		//data.forEach(str->System.out.println(str));
		
		data.forEach(System.out::println);
		
		
		
	}

}
