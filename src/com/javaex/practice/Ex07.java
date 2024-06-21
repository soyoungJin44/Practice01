package com.javaex.practice;

public class Ex07 {

/*
 	<문제>다음 코드에서 변수로 사용할 수 없는 경우 이유를 작성하세요.
		(코드를 작성해서 오류가 없도록 변경해 보세요)
 	
 	public static void main(String[] args){
 	
 	int true;
 	int #_of_workers;
 	int countOfLettersinString;
 	int 1stLevel1;
 	int person#;
 	int _person;
 	
 */
	//<답>
	public static void main(String[] args) {
	
	//int true; 				>> true는 논리값이므로 사용할수없다.
	//int #_of_workers; 		>> $,_외의 특수기호는 사용할수없다.
	int countOfLettersInString;
	//int 1stLevel1; 			>>숫자로 시작할수없다.
	//int person#; 				>> $,_외의 특수기호는 사용할수없다.
	int _person;
	
}
}
