package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
	
		System.out.println("Point관리=============================================");
		
		
		//Point를 관리하는 리스트(배열대신 사용)를 만든다.
		
		PointList pList = new PointList();   //디폴트 생성자 작동
		
		
		Point p00 = new Point(2,2);
		Point p01 = new Point(3,3);
		Point p02 = new Point(4,4);
		
		
		pList.add(p00);  //배열1개   0x111
		pList.add(p01);  //배열2개
		pList.add(p02);  //배열3개
		
		System.out.println(pList);
		
		System.out.println(pList.size());  // length = 3
		
		System.out.println(pList.get(1).toString());   //   Point [x=3, y=3]
		System.out.println(pList.get(1));			   //   Point [x=3, y=3]
		System.out.println(pList.get(1).getX());	   //   3
		
		
		for(int i = 0; i<pList.size(); i++) {
			System.out.println(pList.get(i));
			System.out.println(pList.get(i).getY());
		}
		
		System.out.println("================================================");
		System.out.println("");
		
		/////////////////////////////////////////////////////////////////////////////
		////////////원관리////////
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("==================================원관리============================");
		
		//포인트를 관리하는 리스트(배열대용)를 만든다.
		CircleList cList = new CircleList();
		
		Circle c01 = new Circle(77);
		Circle c02 = new Circle(88);
		Circle c03 = new Circle(99);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		System.out.println(cList);
		
		System.out.println(cList.size());
		
		System.out.println(cList.get(1).toString());
		System.out.println(cList.get(2));
		System.out.println(cList.get(2).getRadius());
		
		System.out.println("========================================================");
		System.out.println("");
		
		for(int i = 0; i<cList.size(); i++) {
			System.out.println(cList.get(i));
			System.out.println(cList.get(i).getRadius());
		}
		//CircleList에 cList라는 변수명(주소)를 만들고 거기에서
		//Circle안에 값을담은 배열을 넣어 관리하기 위함이다.
		//이 돌아가는 원리를 꼭 잘 파악해야한다.
		
		
		
		
		
		
//		System.out.println(pList.get(1));   //Point  [x=3, y=3]
//		   
//		pList.remove(1);    // [1]데이터 삭제하는 기능.  -->그럼 배열이 2개
//		
//		
//		
//		
//		Point p03 = new Point(100,100);
//		pList.add(p03);   //배열3개
//		
//		
		
		
		
		/*
		//배열 사용시!
		Point[] pArray = new Point[100];  //갯수를 정해야하는 한계가있다.
		
		
		Point p00 = new Point(2,2);
		Point p01 = new Point(3,3);
		
		
		pArray[0] = p00;
		pArray[1] = p01;
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i]);
		}
		*/
		
	}

}
