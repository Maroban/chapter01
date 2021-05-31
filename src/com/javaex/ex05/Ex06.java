package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {

		int[] intArray = new int[3];

		intArray[0] = 11;
		intArray[1] = 3;
		// intArray[2] = 78;   //값이 없을 경우 정수형 ==> 0으로 표기

		System.out.println("=================================");
		System.out.println(intArray.length);
		System.out.println("=================================");

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("=================================");

		// 등호 실수로 없는 방 사용하려고 할 때 오류
		for (int i = 0; i <= intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
