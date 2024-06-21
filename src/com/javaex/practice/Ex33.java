package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		
		double v = ((double)4/(double)3) * 3.14 * r * r * r;
		System.out.println("구의 부피는: " + v + " 입니다.");
		
		
	}

}
