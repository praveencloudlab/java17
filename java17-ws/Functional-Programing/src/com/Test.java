package com;

public class Test {

	public static void main(String[] args) {
		
		SimpleInterface si= ()->{
			System.out.println("One");
			System.out.println("Two");
		};
		
		si.doSomething();
		si.f1();
		si.f2();
		
		SimpleInterface.f3();

	}

}
