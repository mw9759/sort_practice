package com.ssafy.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface LambdaFunctionMax {
	int max(int a, int b);
}

@FunctionalInterface
interface LambdaFunction2Print {
	void printString(String str);
}

public class LambdaTest {
	
	public static void main(String[] args) {
		//--1. 함수형인터페이스
		LambdaFunctionMax f = (a, b) -> a > b ? a: b;
		
		int answer = f.max(5, 10);
		System.out.println(answer);
		System.out.println();
		
		//--2. 익명객체
		List<String> list = Arrays.asList("김혜진", "서은지", "한진성", "강석민", "남현우");
		System.out.println(list);
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		
		System.out.println(list);
		System.out.println();
		
		//--3. 람다식
		list = Arrays.asList("김혜진", "서은지", "한진성", "강석민", "남현우");
		System.out.println(list);
		
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
		System.out.println(list);
		System.out.println();
		
		//--4-2. 인터페이스형 변수에 람다식 대입: 
		LambdaFunction2Print f2 = str -> System.out.println(str);
		f2.printString("f2: A1");
		
		//--4-3. 메서드의 매개변수로 함수형 인터페이스 타입의 매개변수 전달
		LambdaFunction2Print f3 = str -> System.out.println(str + "***");
		methodA(f3, "f3: B1");
		
		//--5-2. 반환값으로 사용하는 람다식
		LambdaFunction2Print f4 = methodB();
		f4.printString("f4: C1");
	}
	
	//--4-1. 함수형 인터페이스 타입으로 매개변수 받음
	public static void methodA(LambdaFunction2Print f, String str) { 
		f.printString(str);  // 람다식 호출
	}

	
	//--5-1. 함수형 인터페이스 타입의 반환타입
	public static LambdaFunction2Print methodB() {
		//LambdaFunction2Print f2 = str -> System.out.println(str);
		//return f2;
		return str -> System.out.println(str + "===");
	}
}
