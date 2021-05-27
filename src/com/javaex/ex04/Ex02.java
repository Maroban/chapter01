package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("단을 입력해주세요.");
		System.out.print("단: ");
		int c = sc.nextInt();

		int i = 1;

		while (i <= 9) {
			System.out.println(c + " * " + i + " = " + (c * i));
			i++;
		}

		sc.close();

	}

}
