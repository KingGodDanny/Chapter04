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
		System.out.println(pSet.toString());
		
		
		
		
	}

}
