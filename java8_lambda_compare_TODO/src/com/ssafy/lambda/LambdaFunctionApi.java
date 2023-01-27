package com.ssafy.lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class LambdaFunctionApi {
	public static void main(String[] args) {
		// java.util.function --------------
		// Java 기본제공 함수 api:  int 단일값을 매개변수로 받아 연산 수행 함수
		IntFunction f = (a) -> a + 10;
		System.out.println(f.apply(10));
		f = (a) -> a * a;
		System.out.println(f.apply(10));
		System.out.println();
		
		// Java 기본제공 함수 api: 동형 타입의 매개변수를 2개 받아 연산 수행 함수
		BinaryOperator f2 = (a, b) -> a + " " + b;
		System.out.println(f2.apply(10, 20));
		System.out.println(f2.apply("SSAFY", "광주5반"));
		System.out.println(f2.apply(new Date(), new SimpleDateFormat("yyyy/MM/dd").format(new Date())));
		System.out.println();
		
		//------------------------------
		Predicate<String> isLength = s -> s.length() == 0;
		if(isLength.test("")) {
			System.out.println("공백문자열");
		}
		
		isLength = s -> s.length() < 10;
		if(isLength.test("ssafy")) {
			System.out.println("10자리 미만 문자열");
		}
	}
}
