package com.ssafy.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MemberSortTest {
	public static void main(String[] args) {
		Member m1 = new Member("user01", "password01", "홍길동", "010-1234-1000", "user01@ssafy.com");
		Member m2 = new Member("user02", "password02", "강감찬", "010-1234-2000", "user02@ssafy.com");
		Member m3 = new Member("user03", "password03", "이순신", "010-1234-3000", "user03@ssafy.com");
		Member m4 = new Member("user04", "password04", "김유신", "010-1234-4000", "user04@ssafy.com");
		Member m5 = new Member("user05", "password05", "홍길동", "010-1234-5000", "user05@ssafy.com");
		
		List<Member> list = Arrays.asList(m3, m4, m1, m2,  m5);
		System.out.println("-- 정렬 전 --");
		for(Member m : list) {
			System.out.println(m);
		}
		
		System.out.println("-- 정렬 후  --");
		// TODO: 정렬
		Collections.sort(list);
		
		for(Member m : list) {
			System.out.println(m);
		}
	}
}
