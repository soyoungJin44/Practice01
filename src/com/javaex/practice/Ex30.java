package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	//마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정)
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("마일을 입력하세요: ");
	double mile = sc.nextDouble();
	
	double km = mile * 1.609;
	
	System.out.println(mile + "마일은" + km + "킬로미터 입니다.");
		
	}

}
