package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1,2);
		Point p02 = new Point(3,6);
		Point p03 = new Point(5,10);
		
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
//		for(Point p : pSet) {
//			System.out.println(p.toString());
//		}
		
		System.out.println(pSet.toString());  //개발용으로 빨리보기위함
		
		
		//Integer에서는 같은 하나의 숫자를 중복제거했는데
		//p02와 p04가 중복으로 같은데 그대로 출력된다.
		//중복의 정의가 필요하다.
		//HashCode를 이용해서 중복체크를 하게 될것이라 HashSet으로 이름을 지었다.
		
		Point p04 = new Point(3,6);
		pSet.add(p04);
		System.out.println("=========(중복)==============");
		System.out.println(pSet.toString());
		System.out.println("=========(중복)==============");
		
		
		System.out.println("equals()===========================================");
		//Point 비교  -->equals()
		System.out.println(p02.equals(p04));  //내가 정의한 메소드(로직)비교 -->true
		System.out.println(p02 == p04);       //주소비교 -->false
		
		
		System.out.println(p01.equals(p04));
		System.out.println(p01 == p04); 	  //주소비교 -->false
		
		
		System.out.println("hashCode()===========================================");
		//hashCode()
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		System.out.println(p04.hashCode());
		
		
		
		
		//1차로 hashCode(포인트의경우 x+y) 를 판단한 후 같다면
		//2차로 equals에서 p02(3,6) / p04(3,6)인지  p02(3,6) / p04(2,7)인지 확인하고
		//걸러낸다.  
		//hashCode메소드를 써주기전엔 (중복)의 출력이
		//[Point [x=1, y=2], Point [x=3, y=6], Point [x=5, y=10] ,Point [x=3, y=6]]이 나오지만
		
		//hashCode를 사용하고 equals까지 검증되면 (중복)의 출력이
		//[Point [x=1, y=2], Point [x=3, y=6], Point [x=5, y=10]] 로 출력된다.
	
		
		
		
		
		
		
		
		
	}

}
