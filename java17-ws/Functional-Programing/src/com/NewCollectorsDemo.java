package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewCollectorsDemo {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A","B","A","C","B","D");
		
		Map<String, Long> data = list.stream().collect((Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		System.out.println(data);
	}

}
