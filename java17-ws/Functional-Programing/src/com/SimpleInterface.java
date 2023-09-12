package com;
@FunctionalInterface
public interface SimpleInterface {
	
	interface Abc{
		
	}
	
	class Xyz{
		
	}
	
	void doSomething();
	//void f1();
	
	default void f1() {
		System.out.println("f1 method");
	}
	
	default void f2() {
		System.out.println("f2 method");
	}
	
	static void f3() {
		System.out.println("f3 static method");
	}
	
	
	

}
