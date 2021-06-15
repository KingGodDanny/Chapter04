package com.javaex.ex05;

import java.util.LinkedList;
import java.util.List;

import com.javaex.ex04.Point;

public class PointApp {

	public static void main(String[] args) {
		
		//ArrayList가 아닌 List와 import가 하나 추가된 내용!!!
		
		//List<Point> pList = new ArrayList<Point>(); 는 섞어쓰기가 된것이고
		//implements된 List<Point>로 시선이 가있고 List<Point>의 add,size등 정해진것만
		//ArrayList<Point>()에서 사용할수 있는데 만약 ArrayList의 단점때문에
		//LinkedList를 사용해야한다면 List<Point> pList = new Linked<Point>();로
		//바꿔준다면 사용이 가능하다. 나중에 혹시 몰라서 바꿀 계획이 있다면 표준을 지켜놓은
		//implements(interface)를 사용하는것이 좋다.
		
		
		
		//List<Point> pList = new ArrayList<Point>(); 단점때문에 아래로바꿈. 임포트도 변경됌.
		List<Point> pList = new LinkedList<Point>();
		
		
		Point p01 = new Point(2,8);
		Point p02 = new Point(7,3);
		Point p03 = new Point(6,8);
		
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		
		for(Point p : pList) {
			System.out.println(p.toString());
		}
		
		
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
		
		
	}

}
