package com.javaex.practice;

public class Ex21 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i % 2;
		
		System.out.println(i);
		System.out.println(n);

		// Ex20문제는 후위증감연산자이기때문에 연산 후 +1이 되고, 지금 문제에서는 전위증감연산자로써 먼저 +1을 한 후에 연산한다.
	}

}
