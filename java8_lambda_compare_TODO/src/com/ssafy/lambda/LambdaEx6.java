package com.ssafy.lambda;

@FunctionalInterface
interface Function{
	public int calc(int a, int b);
	
	default public void view1() {
		System.out.println("view1 method");
	}
	
	default public void view2() {
		System.out.println("view2 method");
	}
}

public class LambdaEx6 {
	public static void main(String[] args) {
		Function m1=(a,b)-> a+b;
		Function m2=(a,b)-> a-b;
		
		int m3=m1.calc(10, 20) + m2.calc(30, 40);
		System.out.println("결과:" + m3);  // 20
		
		m1.view1();
		m1.view2();
	}
}
