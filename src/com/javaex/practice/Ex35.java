package com.javaex.practice;

public class Ex35 {

	//long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
	//단 빛의 속도는 300000 km/s 로 계산한다. (초 단위)
	
	public static void main(String[] args) {

		long distance = 300000 * (60 * 60 * 24 * 365L);
		System.out.println("빛이 1년 동안 가는 거리는 " + distance + "km 입니다.");
		
	}
}
