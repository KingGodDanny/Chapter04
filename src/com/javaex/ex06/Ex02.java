package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		Set<Integer> lottoSet = new HashSet<Integer>();
		
		while(lottoSet.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			lottoSet.add(num);  //중복체크
			
		}
		
		System.out.println("==============================");
		
		for(int lottoNum : lottoSet) {
			System.out.print(lottoNum + "   ");
		}
		
		
//		Integer r01 = (int)(Math.random()*45)+1;
//		Integer r02 = (int)(Math.random()*45)+1;
//		Integer r03 = (int)(Math.random()*45)+1;
//		Integer r04 = (int)(Math.random()*45)+1;
//		Integer r05 = (int)(Math.random()*45)+1;
//		Integer r06 = (int)(Math.random()*45)+1;
//		
//		lotto.add(r01);
//		lotto.add(r02);
//		lotto.add(r03);
//		lotto.add(r04);
//		lotto.add(r05);
//		lotto.add(r06);
//		
//		
//		
//		for(Integer num : rSet) {
//			if(rSet.size()==6) {
//				System.out.println(num.toString());
//			} 
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
	}

}
