package com;

interface M1 {
	void f1();
}

interface Sum{
	int add(int x,int y);
}

public class Ex1 {

	// any interface with a single method is can be used for lambda expression

	public static void main(String[] args) {
		
		Runnable r=()->System.out.println("Running code..."+Thread.currentThread().getName());
		
		
		M1 m1Obj=()->System.out.println("Test");
		
		Sum s=(a,b)->a+b;
		
		int res = s.add(100, 200);
		System.out.println(res);
		
		m1Obj.f1();
		
		
		Thread t1=new Thread(r,"T1");
		Thread t2=new Thread(r,"T2");
		
		//t1.start();
		//t2.start();
		
		/*
		 * -> lambda with out arguments and with out return type
		 * 		Test t=()->System.out.println("Hello");
		 * -> lambda with arguments with out return type
		 * 		Test t=(a)->Systen.out.println(a);
		 * -> lambda body with more than one statements
		 * 		Test t=()->{
		 * 			// 1
		 * 			// 2
		 * 			// 3
		 * 		};
		 * 
		 * -> lambda with arguments and return type
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	

	}

}
