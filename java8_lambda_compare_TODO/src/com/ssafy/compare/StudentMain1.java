package com.ssafy.compare;

import java.util.Arrays;

class Student1 { // TODO: 
	String name;
	int num;
	double score;
	
	public Student1() { }
	public Student1(String name, int num, double score) {
		this.name = name;
		this.num = num;
		this.score = score;
	}

	@Override
	public String toString() {
		return name+" "+num+" "+score;
	}	

	//@Override
	public int compareTo(Student1 o) {
		//1. 이름 오름차순 : this가 앞에 있으면 오름차순, 뒤에 있으면 내림차순
		return this.name.compareTo(o.name);         
		
		// TODO: 
		//2. 점수 오름차순: this가 왼쪽에 있으면 오름차순, 오른쪽에 있으면 내림차순
		
		//3. 학번 내림차순
		
		//4. 점수 내림차순, 점수가 같으면 학번 올림차순
	}
}

public class StudentMain1 {
	public static void main(String[] args) {
		Student1[] array = {
			new Student1("홍길동", 20220301, 4.5),
			new Student1("강감찬", 20210301, 3.5),
			new Student1("이순신", 20190301, 2.5),
			new Student1("김유신", 20170301, 4.5),
			new Student1("유관순", 20170302, 3.5)
		};
		
		System.out.println("-- 정렬 후 --");
		Arrays.sort(array);
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);   
		}
	}
}














