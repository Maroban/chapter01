package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		double v01 = 5/4;			//int = int / int * 소수점 안나옴
		System.out.println(v01); 	//int --> double로 자동형변환이 이뤄진 것.
		
		double v02 = (double)5/4;
		System.out.println(v02); //1.25
		
		double v03 = 5/(double)4;
		System.out.println(v03); //1.25
		
		double v04 = (double)5/(double)4;
		System.out.println(v04); //1.25
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05); //2
		
		int v06 = (int)(1.3+1.8);
		System.out.println(v06);

	}

}















