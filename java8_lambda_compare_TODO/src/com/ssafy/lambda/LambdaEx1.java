package com.ssafy.lambda;

//자바함수형 interface, 람다식으로 사용할 것을 선언
//함수는 반드시 1개
@FunctionalInterface
interface Print { 
	public void view();  
	//public void print();  //메서드 하나만 있어야ㅕ 한다@FunctionalInterface이기 떄문
}

//3. 일반 메서드 형태-----------------------------------------
//public class LambdaEx1 implements Print {
//	@Override
//	public void view() {
//		System.out.println("Hello Lambda");
//	}
//	
//	public static void main(String[] args) {
//		new LambdaEx1().view();
//	}
//}

//1. 람다식 형태---------------------------------------------
//public class LambdaEx1{
//	public static void main(String[] args) {
//		Print m = () -> System.out.println("Hello Lambda");
//		m.view();
//	}
//}

//2. 익명 중첩클래스 형태(Anonymous inner class)----------------
//LambdaEx1$1.class가 생성됨 
//public class LambdaEx1{
//	public static void main(String[] args) {
//		Print m = new Print() {
//			@Override
//			public void view() {
//				System.out.println("Hello Lambda");
//			}
//		};
//		m.view();
//	}
//}
//



