package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {

		//월급을 입력받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요: ");
		long salary = sc.nextLong();
		
		long max = salary * 12 * 10;
		System.out.println("10년동안 최대 저축액은 " + max + "원 입니다." );
		
	}

}
