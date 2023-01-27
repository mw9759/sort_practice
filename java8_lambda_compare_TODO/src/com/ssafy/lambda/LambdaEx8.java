package com.ssafy.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//인자2개받는 생성자, getter
class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
}

public class LambdaEx8 {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("홍길동", 100));
		list.add(new Student("강감찬", 70));
		list.add(new Student("이순신", 85));
		list.add(new Student("김유신", 60));
		list.add(new Student("유관순", 95));
		
		System.out.println("*** 정렬 전 ***");
		list.forEach((m)-> System.out.println(m.getName() +"  " + m.getScore()));
		
		// 정렬------------
//		list.sort((m1,m2)->m1.getName().compareTo(m2.getName())); // 이름 올림차순 정렬
		list.sort((m1,m2)->m1.getScore()-m2.getScore());  // 점수 올림차순 정렬
		
//		list.sort((m1,m2)->m2.getName().compareTo(m1.getName())); // 이름 내림차순 정렬
//		list.sort((m1,m2)->m2.getScore()-m1.getScore());  // 점수 내림차순 정렬
		
		System.out.println("*** 정렬  후***");
		list.forEach((m)-> System.out.println(m.getName() +"  " + m.getScore()));
		
//		System.out.println((int)'k' + "   "+(int)'l');  // k(107),  l(108)
	}
}

/*
[참고]
Collections.sort(list, new Comparator<Student>() {
	@Override
	public int compare(Student o1, Student o2) {
		//return o1.getName().compareTo(o2.getName());  //오름차순
		return o2.getTot()-o1.getTot();	// 내림차순
	}
});








*/




