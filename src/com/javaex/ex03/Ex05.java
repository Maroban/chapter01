package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		int pay = 10000;
		double pay02 = 1.5;

		Scanner sc = new Scanner(System.in);

		System.out.print("근무시간: ");
		int time = sc.nextInt();

		if (time < 0) {

		} else if (time > 8) {
			System.out.println("임금은 " + ((pay * 8) + (time - 8) * (int) (pay * pay02)) + "원 입니다.");
		} else {
			System.out.println("임금은 " + (time * pay) + "원 입니다.");
		}

		sc.close();

	}

}
