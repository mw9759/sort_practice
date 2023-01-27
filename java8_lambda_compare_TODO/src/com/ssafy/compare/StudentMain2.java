package com.ssafy.compare;

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
		
		//Arrays.sort(array);//기본 설정된 방법의 정렬.오류뜨는데 정렬가능한 객체가 아님.
		
		// 익명중첩클래스(Anonymous inner class)---------------------
		// 학점으로 내림차순정렬하시오. 만약,학점이 같으면 학번으로 내림차순 정렬하시오
		Arrays.sort(array, new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1, Student2 o2) {
				if(o1.score == o2.score) {           // 학점이 같으면
					//return o2.num - o1.num;        // 학번으로 내림차순 정렬
					return Integer.compare(o2.num, o1.num);
				}
				// 학점으로 내림차순 정렬: 
				// 첫번째 인자가 왼쪽에 오면 올림, 두번째 인자가 왼쪽에 오면 내림
				return Double.compare(o2.score, o1.score);  
			}
		});
		
		System.out.println("-- 학점 내림차순 / 학번 내림차순 --");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);   
		}
		
		//------------------------------------------------------
		// 이름으로 오름차순: TODO
		System.out.println("-- 이름으로 오름차순 --");
		Arrays.sort(array, new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1, Student2 o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		});
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);   
		}
		
		//------------------------------------------------------
		// 학점으로 내림차순: TODO
		
		System.out.println("-- 학점으로 내림차순 --");
		
		Arrays.sort(array, new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1, Student2 o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.score, o1.score);
			}
		});
		
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
		
		System.out.println("-- Collection List : 성적내림 / 이름올림 정렬 --");
		// TODO
		
		Collections.sort(list, new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1, Student2 o2) {
				// TODO Auto-generated method stub
				if(Double.compare(o2.score, o1.score) == 0) {
					return o1.name.compareTo(o2.name);
				}
				return Double.compare(o2.score, o1.score);
			}
		});
		
		for(Student2 s : list) {
			System.out.println(s);
		}
		
		System.out.println("-- Lambda 표현식 : 이름올림 --");
		// TODO
		
		Collections.sort(list, (o1,o2) -> o1.name.compareTo(o2.name));
		
		for(Student2 s : list) {
			System.out.println(s);
		}
		
		System.out.println("-- Lambda 표현식 : 성적내림 / 이름올림 정렬 --");
		// TODO:
		
		for(Student2 s : list) {
			System.out.println(s);
		}
		
	}
}














