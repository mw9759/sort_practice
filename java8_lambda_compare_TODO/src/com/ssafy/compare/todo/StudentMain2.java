package com.ssafy.compare.todo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 {
	String name;
	int num;
	double score;
	
	public Student2() {	}
	public Student2(String name, int num, double score) {
		this.name = name;
		this.num = num;
		this.score = score;
	}
	@Override
	public String toString() {
		return name+" "+num+" "+score;
	}
}
public class StudentMain2 {
	public static void main(String[] args) {
		Student2[] array = {
			new Student2("홍길동", 20220301, 4.5),
			new Student2("강감찬", 20210301, 3.5),
			new Student2("이순신", 20190301, 2.5),
			new Student2("김유신", 20170301, 4.5),
			new Student2("유관순", 20170302, 3.5)
		};

		// TODO ------------------------------------
		// 익명중첩클래스(Anonymous inner class)---------------------
		// 학점으로 내림차순정렬하시오. 만약,학점이 같으면 학번으로 내림차순 정렬하시오
		
		System.out.println("-- 학점 내림차순 / 학번 오름차순 --");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);   
		}
		
		//------------------------------------------------------
		// 이름으로 오름차순
		// TODO ------------------------------------
		
		
		System.out.println("-- 이름으로 오름차순 --");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);   
		}
		
		//------------------------------------------------------
		// 학점으로 내림차순
		// TODO ------------------------------------
		
		
		System.out.println("-- 학점으로 내림차순 --");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);   
		}
		
		//------------------------------------------------------
		// Collection List 정렬
		List<Student2> list = Arrays.asList(
			new Student2("홍길동", 20220301, 4.5),
			new Student2("강감찬", 20210301, 3.5),
			new Student2("이순신", 20190301, 2.5),
			new Student2("김유신", 20170301, 4.5),
			new Student2("유관순", 20170302, 3.5));
		
		System.out.println("-- Collection List 정렬 전 --");
		for(Student2 s : list) {
			System.out.println(s);
		}
		
		// TODO ------------------------------------
		
		System.out.println("-- Collection List : 성적내림 / 이름올림 정렬 --");
		for(Student2 s : list) {
			System.out.println(s);
		}
		
	}
}














