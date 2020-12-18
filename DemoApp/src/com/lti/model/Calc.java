package com.lti.model;

public class Calc {
	public void add(int n1, int n2) {
		System.out.println("Sum is "+(n1+n2));
	}
	public void diff(int n1, int n2) {
		System.out.println("Difference is "+(n1-n2));
	}
	public void mul(int n1, int n2) {
		System.out.println("Multiplication is "+(n1*n2));
	}
	public void div(int n1, int n2) {
		System.out.println("Quotient is "+(n1/n2));
	}
	public void rem(int n1, int n2) {
		System.out.println("Remainder is "+(n1%n2));
	}

}
