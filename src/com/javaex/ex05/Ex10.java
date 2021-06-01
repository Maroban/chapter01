package com.javaex.ex05;
/*
main의 역할
javac Ex10.java => Ex10.class
java Ex10.class 실행
*/
public class Ex10 {

	public static void main(String[] args) {
		
		char[] arrC = new char[3];
		
		arrC[0] = '아';
		arrC[1] = '이';
		arrC[2] = '유';
		
		
		
		String[] arrS = new String[3];
		
		arrS[0] = "정우성";
		arrS[1] = "이효리";
		arrS[2] = "유재석";
		
		for (int i = 0; i < arrC.length; i++) {
			System.out.println(arrC[i]);
		}

		System.out.println("===========================");
		
		for (int i = 0; i < arrS.length; i++) {
			System.out.println(arrS[i]);
		}
	}

}
