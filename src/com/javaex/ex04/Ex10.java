package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("==============continue==============");
		for (int m = 1; m < 21; m++) {
			if (m % 2 == 0 || m % 3 == 0) {
				continue;				
			}
			System.out.println(m);
		}
		System.out.println("==============if-else==============");
		for(int i = 1; i <=20; i++) {
			if(i%2==0 || i%3==0) {
				
			} else {
				System.out.println(i);
			}
		}
		System.out.println("==============if==============");
		for(int i = 1; i <=20; i++) {
			if(!(i%2==0 || i%3==0)) {
				System.out.println(i);
			}
		}
	}

}
