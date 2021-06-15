package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		//HashSet 만들기  (Set와 HashSet 섞어쓰기)
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = 4;  //박싱 
		Integer i02 = 5;
		Integer i03 = 6;
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		
		
		System.out.println(iSet.size());
		
		System.out.println(iSet.toString());
		
		System.out.println("---------------------------------");
		
		//Set,HashSet에는 방번호가 따로 없고 순서가 없기때문에
		//for문에서 i로 돌릴수가 없다. 그래서 밑에처럼 for을 돌리는 방법을 잘알아야한다.!!
		
		for(Integer num : iSet) {
			System.out.println(num);
		}
		
		System.out.println("---------------------------------");
		
		Integer i04 = 5;
		iSet.add(i04);
		for(Integer num : iSet) {
			System.out.println(num);
		}
		
		//5를 추가했는데 그래도 4,5,6이 나온다.
		
	}
	
}
