package com;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		Optional<String> optinal=Optional.empty();
		System.out.println(optinal.isPresent());
		//System.out.println(optinal.get());
		String s1 = optinal.orElse("Default Value");
		//optinal.orElseThrow();
		System.out.println(s1);
		
		
		
	}

}
