package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {

		int[] no = new int[4];

		
		//입력은 수동으로 해야한다. (운이 좋아서 쓸 수 있는 상황)
		for (int i = 0; i < no.length; i++) {
			no[i] = (int) (Math.random() * 45) + 1;
		}
		
		for (int i = 0; i <no.length; i++) {
			System.out.println(no[i]);
		}
		
		System.out.println("====================================");

		for (int i = 0; i < 6; i++) {  //방 갯수보다 적으면 오류는 안 뜬다.
			System.out.println(no[i]);
		}
		
		
		
		
	}

}
