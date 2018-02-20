package com.iu.s1;

import java.util.Scanner;

public class SchoolController {

	//메서드명은 start , 리턴은 X, 
	//내용은
	//1.학생 등록
	//2.성적 입력
	//3.성적 조회
	//4.전체 조회
	//5.프로그램 종료
	public void start() {
		/*if(number==1) {
			System.out.println("1.학생 등록");
		}else if(number==2) {
			System.out.println("2.성적 입력");	
		}else if(number==3) {
			System.out.println("3.성적 조회");
		}else if(number==4) {
			System.out.println("4.전체 조회");
		}else if(number==5) {
			System.out.println("5.프로그램 종료");	
		}*/
		Scanner sc =new Scanner(System.in);
		System.out.println("번호 입력 ");
		int number= sc.nextInt();
		switch(number) {
		case 1 :System.out.println("1.학생 등록");
		break;
		case 2 :System.out.println("2.성적 입력");
		break;
		case 3:System.out.println("3.성적 조회");
		break;
		case 4:System.out.println("4.전체 조회");
		break;
		case 5:System.out.println("5.프로그램 종료");	
		break;
		default:

		}
	}
}
