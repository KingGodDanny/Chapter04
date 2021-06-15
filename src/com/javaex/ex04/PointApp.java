package com.javaex.ex04;

import java.util.ArrayList;

public class PointApp {

	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<Point>();
		//제네릭엔 <int>기본자료형 안됌. 그래서 <Integer>가능함.
		
		
		Point p01 = new Point(2,8);
		Point p02 = new Point(7,3);
		Point p03 = new Point(6,8);
		Point p04 = new Point(1,9);
		
		
		pList.add(p01);
		System.out.println(pList.size());
		
		pList.add(p02);
		System.out.println(pList.size());
		
		pList.add(p03);
		System.out.println(pList.size());
		
		//pList.add(p04);
		
		
		System.out.println("--------------------------------");
		
		
		Point p = pList.get(1);
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p.toString());
		System.out.println(p);   //<--Point에 toString이 있기때문에 x,y출력가능
		
		
		System.out.println("---------------------------------");
		for(int i=0; i<pList.size(); i++) {
			Point pp = pList.get(i);
			System.out.println(pp);
		}
		
		
		System.out.println("---------------------------------");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).getX());
		}
		//x와 y를 따로 반복으로 출력할거면 Point pp = pList.get(i).getX() or getY();
		
		System.out.println("---------------------------------");
		System.out.println(pList.toString());

		System.out.println("");
		System.out.println("===================p04[1] - add");
		//4번째 p04 --> [1]에 add
		
		pList.add(1, p04);  //1번째방에 p04를 넣어라!
		System.out.println(pList);  //toString 안써두됌
		
		System.out.println("");
		System.out.println("==================p04[1] - remove");
		//[1] p04를 삭제
		pList.remove(1);
		System.out.println(pList);
		
		System.out.println("");
		System.out.println("---------------------------------");
		//향상된 for문 무조건 처음부터 끝까지!
		for(Point ppp : pList) {
//			System.out.println(ppp.getX());
			System.out.println(ppp);
		}
		
		
		
		//pList 원 추가
		Circle c01 = new Circle(100);
		
		//pList.add(c01);   --제네릭으로 <Point>를 넣었기때문에 Circle 추가 불가능.)
		
		
		
		
		
		
	}

}
