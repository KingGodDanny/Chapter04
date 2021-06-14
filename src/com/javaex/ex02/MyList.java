package com.javaex.ex02;

import java.util.Arrays;

public class MyList {

	//필드=================================================
	
	private Object[] oArray;
	private int crtPos;
	
	
	
	//생성자=================================================
	
	public MyList() {
		this.oArray = new Object[3];
		crtPos = 0;
	}
	

	
	//메소드(게터세터)=================================================
	
	
	//메소드(일반)=================================================
	
	public void add(Object object) {
		oArray[crtPos] = object;
		crtPos = crtPos + 1 ; //crtPos++
		
	}
	
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}


	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
}
