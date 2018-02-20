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
			Scanner sc =new Scanner(System.in);
			Student [] students =null;
			StudentService ss= new StudentService();
			StudentView sv= new StudentView();
		boolean check =true;
		
		while(check) {
		System.out.println("1.학생 등록");
		System.out.println("2.성적 입력");		
		System.out.println("3.성적 조회");
		System.out.println("4.전체 조회");
		System.out.println("5.프로그램 종료");		
		
		System.out.println("번호 입력 ");
		int select= sc.nextInt();
		
		switch(select) {
		case 1 :System.out.println("학생 등록");
		students=ss.addStudent();
		break;
		case 2 :System.out.println("성적 입력");
		break;
		case 3:System.out.println("성적 조회");
		break;
		case 4:System.out.println("전체 조회");
		sv.view(students);
		break;
		default:System.out.println("Finish");
		check=!check; //while문이 끝나야 되기 때문

		}
		
		}
	
	}
}
