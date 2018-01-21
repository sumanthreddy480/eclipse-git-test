package com.test;

public class CTwo extends COne {

	@Override
	public void m1() throws NullPointerException{
		//super.m1();
		System.out.println("m1 from CTwo");
	}

	public void m2() {
		System.out.println("m2 from CTwo");
	}
}
