package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			                  // 이 조건문이 밑으로 가면 "3의 배수입니다" 라고 뜸
			if (num == 0) {   // 0도 3의 배수기 때문
				System.out.println("종료");  //읽히는 순서가 정말 중요함
				break;
				
			}
			if (num % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}

		}
		sc.close();
	}

}
