package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int f = sc.nextInt();
		System.out.print("100원 개수: ");
		int o = sc.nextInt();
		System.out.print("50원 개수: ");
		int h = sc.nextInt();
		System.out.print("10원 개수: ");
		int t = sc.nextInt();
		
		
		int result = (500 * f) + (100 * o) + (50 * h) + (10 * t);
		
		System.out.println("동전의 총합은 " + result + " 원 입니다.");
		
		sc.close();
	}

}
