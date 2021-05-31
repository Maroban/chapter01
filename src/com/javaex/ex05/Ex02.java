package com.javaex.ex05;

public class Ex02 {
	public static void main(String[] args) {

		/*
		no[0] = (int) (Math.random() * 45) + 1;
		no[1] = (int) (Math.random() * 45) + 1;
		no[2] = (int) (Math.random() * 45) + 1;
		no[3] = (int) (Math.random() * 45) + 1;
		no[4] = (int) (Math.random() * 45) + 1;
		no[5] = (int) (Math.random() * 45) + 1;
		*/

		/*
		  System.out.println(no[0]);
		  System.out.println(no[1]);
		  System.out.println(no[2]);
		  System.out.println(no[3]);
		  System.out.println(no[4]);
		  System.out.println(no[5]);
		 */
		
		int[] no = new int[6];

		for (int i = 0; i < 6; i++) {
			no[i] = (int) (Math.random() * 45) + 1;
			System.out.println(no[i]);
		}

	}

}
