package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {

		// 배열이 같은지 판단
		int[] arrA = new int[3];
		arrA[0] = 10;
		arrA[1] = 20;
		arrA[2] = 30;

		int[] arrB = new int[3];
		arrB[0] = 10;
		arrB[1] = 70;
		arrB[2] = 30;
		//arrB[3] = 40;

		// 배열A, 배열B이 같은지 판단 => 배열의 개수가 같아야 하고, 값과 순서가 같아야 한다.
		if (arrA.length == arrB.length) { // 두 배열의 개수가 같으면 비교 시작

			for (int i = 0; i < arrA.length; i++) {
				if (arrA[i] != arrB[i]) {
					System.out.println(i + "번째 값이 다릅니다.");
				}
			}
		} else {  // 같지 않으면 종료
			System.out.println("배열의 크기가 다릅니다.");
		}

	}

}
