package com.test;

public class TestMain {
	public static void main(String[] args) {

		A a = new A();

		a.method();
		A.m2();
		
		A aa = new B();
		((B)aa).m2();
		
		COne c1 = new CTwo();
		
		c1.m1();
		((CTwo)c1).m2();
	}
}

class A {

	void method() {
		System.out.println("From class A");
	}

	static void m2() {
		System.out.println("static method of A");
	}
}

class B extends A {

	void method() {
		System.out.println("From class B");
	}

	static void m2() {
		System.out.println("static method of B");
	}
}