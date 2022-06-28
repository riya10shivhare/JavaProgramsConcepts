package com.java.concepts;

public class SumTwoNumber {
	private  int a, b;
	public SumTwoNumber(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public  int sum() {
		return (a+b);
	}
	public static void main(String[] args) {
		SumTwoNumber s=new SumTwoNumber(10,54);
		System.out.println(s.sum());
	}

	
	
}
