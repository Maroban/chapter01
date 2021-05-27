package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {

		for (int y = 0; y < 6; y++) {  // 조건식에 x < y 이런 식으로 숫자 말고 자료형이 올 수 있음
			for (int x = 0; x <= y; x++) { // x가 y보다 작거나 같을 때 실행
				System.out.print("*");  // x가 1이고 y가 1이면 1번 실행하고 종료
			}							// x가 4이고 y가 4이면 4번 실행하고 종료
			System.out.println();
		}

	}

}
