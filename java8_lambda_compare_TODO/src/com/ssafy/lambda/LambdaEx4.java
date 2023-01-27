package com.ssafy.lambda;

@FunctionalInterface
interface Ver {
	public String call(String v);  // ver 8.0 또는 ver 5.0
}

public class LambdaEx4 {
	public static void main(String[] args) {
		
		Ver ver1 = (s) -> (s.equals("Java") ? "ver 8.0" : "ver 5.0");
		System.out.println("Java " + ver1.call("Java"));
		System.out.println("Spring " + ver1.call("Spring"));
		
		//---------------------------------------------------------------
		Ver ver2 = (v) -> "Java " + v;            
		System.out.println(ver2.call("ver 8.0"));
		
		Ver ver3 = (v) -> { return "Spring "+ v; };
		System.out.println(ver3.call("ver 5.0"));
	}
}
