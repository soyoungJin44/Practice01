package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	//사용자로부터 화씨 온도를 입력받아 섭씨 온도로 변환하는 프로그램을 작성하세요.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨: ");
		double f = sc.nextDouble();
		
		double c = ((double)5 / 9) * ((double)f - 32);
		System.out.println("화씨 " + f + " 의 섭씨온도는 " + c + " 입니다.");
	}

}
