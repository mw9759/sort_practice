package com.ssafy.compare.todo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortTest {
	public static void main(String[] args) {
		// 문자열
		System.out.println("-- String 비교 --");
		System.out.println("강감찬".compareTo("강감찬")); // 같으면 ??
		System.out.println("강감찬".compareTo("홍길동")); // 작으면 ??
		System.out.println("홍길동".compareTo("강감찬")); // 크면    ??
		
		// 배열
		String[] names = {"홍길동","홍길동","강감찬","이순신","김유신","유관순"};

		System.out.println("-- 배열 정렬 전 --");
		for(String name: names) {
			System.out.println(name);
		}
		
		System.out.println("-- 배열 정렬 후 --");
		Arrays.sort(names);
		for(String name: names) {
			System.out.println(name);
		}
		
		// Collection List
		List<String> list = Arrays.asList("홍길동","홍길동","강감찬","이순신","김유신","유관순");
		System.out.println("-- Collection List 정렬 전 --");
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("-- Collection List 정렬 후 --");
		Collections.sort(list);
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("-- Set > HashSet --");
		HashSet<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("홍길동");
		set.add("강감찬");
		set.add("이순신");
		set.add("김유신");
		set.add("유관순");
		System.out.println(set);	
		
		System.out.println("-- Set > SortedSet > TreeSet --");
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("홍길동");
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		treeSet.add("김유신");
		treeSet.add("유관순");
		System.out.println(treeSet);
		
		System.out.println("-- Map > HashMap --");
		HashMap<String, String> map = new HashMap<>();
		map.put("hong1", "홍길동");
		map.put("hong2", "홍길동");
		map.put("kang", "강감찬");
		map.put("lee", "이순신");
		map.put("kim", "김유신");
		map.put("yu", "유관순");
		System.out.println(map);
		
		System.out.println("-- Map > SortedMap > TreeMap --");
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("hong1", "홍길동");
		treeMap.put("hong2", "홍길동");
		treeMap.put("kang", "강감찬");
		treeMap.put("lee", "이순신");
		treeMap.put("kim", "김유신");
		treeMap.put("yu", "유관순");
		System.out.println(treeMap);
	}
	
}
