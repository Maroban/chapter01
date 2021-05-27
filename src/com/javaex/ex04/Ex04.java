package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {

		int sum = 0;
		 
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;   //sum에 i를 더하여 sum에 저장
			System.out.println(i + " 까지의 합은 " + sum);  //2번째 좋은 예제
		}

		System.out.println("1부터 10까지 정수의 합은 " + sum + " 입니다.");  //1번째 좋은 예제
		
		  //i = 1인 경우 sum의 초기값은 0이기에 0+1 후 결과값인 1이 sum에 저장
		  //i = 2인 경우 위에서 sum값이 1이었기에 1(0+1) +2 후 결과값인 3이 sum에 저장
		  //i = 3인 경우 위에서 sum값이 3이었기에 3(1+2) +3 후 결과값인 6이 sum에 저장
		  //결국 저장 후 더하기 반복하면 0+1+2+3+4+5 ... +10 이 됨
	}

}
