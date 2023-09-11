package com;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo7 {

	private static int var = 10;
	private int instVar;

	public static void main(String[] args) {
		LambdaDemo7 ld = new LambdaDemo7();
		ld.instVar = 10;

		List<Integer> intSeq = Arrays.asList(1, 2, 3, 4);
		intSeq.forEach(x -> System.out.println(x + ld.instVar)); // -> using instance variables
		System.out.println("------------------------------");
		var = 20;// static variable can be modified by any one / any obj.
		intSeq.forEach(x -> System.out.println(x + ld.instVar)); // -> using instance variable on same obj
		System.out.println("------------------------------");
		intSeq.forEach(x -> System.out.println(x + var)); // --> static variable can be updated on any obj

	}

}
