package com.ssafy.lambda;

/* 2. 람다식 --------------------------
 * [문제]간단한 계산기를 람다식으로 작성하시오
 * 
 * 1. 인터페이스명 : Calculator
 *  + calc(a:int, b:int) : double
 *    
 * 2. LambdaEx5에서 
 *    Calculator 객체변수를 만들고 2,5값을 가지고 더하기/빼기/곱하기/나누기를 완성하시오
 *    
 */
// TODO 1 -------------------
@FunctionalInterface
interface Calculator {
	public double calc(double a, double b);
}

public class LambdaEx5_TODO {
	public static void main(String[] args) {
		// TODO: 람다식 사칙연산 재정의
		Calculator calculator = (a,b) -> a+b;
		System.out.println(calculator.calc(10, 5));
		// TODO: 람다식 사칙연산 호출 사용
		calculator = (a,b) -> a-b;
		System.out.println(calculator.calc(10, 5));
		calculator = (a,b) -> a*b;
		System.out.println(calculator.calc(10, 5));
		calculator = (a,b) -> a/b;
		System.out.println(calculator.calc(10, 5));
	}
}

/* 코드 참고 : 1. 일반메서드 --------------
interface Calculator {
	public double add(int a, int b);
	public double sub(int a, int b);
	public double multi(int a, int b);
	public double divi(int a, int b);	
}

public class LambdaEx5_TODO implements Calculator {
	@Override
	public double add(int a, int b) { return a+b; }

	@Override
	public double sub(int a, int b) { return a-b; }

	@Override
	public double multi(int a, int b) { return a*b; }

	@Override
	public double divi(int a, int b) { return (double)a/b; }
	
	public static void main(String[] args) {
		LambdaEx5 ob=new LambdaEx5();
		System.out.println((int)ob.add(2,5));
		System.out.println((int)ob.sub(2,5));
		System.out.println((int)ob.multi(2,5));
		System.out.println(ob.divi(2,5));
	}
}
------------------------------------------------------ */
