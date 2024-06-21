package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		
		/*
		 다음중 결과값이 다른 것을 선택하고 이유를 설명해 보세요.
		 
		 public static void main(String[] args){
		 
		 System.out.println(13 /5);						//(1)
		 System.out.println((double)13 / 5);			//(2)
		 System.out.println(13 / (double)5);			//(3)
		 System.out.println((double)13 / (double)5);	//(4)
		 System.out.println(13.0 / 5);					//(5)
		 System.out.println(13 / 5.0);					//(6)
		 System.out.println((double)(13 / 5));			//(7)
		 
		 
		 <결과값이 다른것> : 
		 (1) : 정수 13 과 정수5를 나누었기 때문에 
		 (7) : 정수상태인 13/5를 한 후에 double형으로 변환되었기때문에 2 => 2.0으로 변환
		 */

		System.out.println(13 /5);
		System.out.println((double)13 / 5);
		System.out.println(13 / (double)5);
		System.out.println((double)13 / (double)5);
		System.out.println(13.0 / 5);	
		System.out.println(13 / 5.0);	
		System.out.println((double)(13 / 5));	
		
		
		
	}

}
