package com.iu.s1;

import java.util.Scanner;

public class StudentService {
//학생 추가 메서드
//메서드명 addStudent 
//내용: 학생의 인원수를 입력하세요 ..
//학생수만큼(이름입력,번호입력)->SchoolController로 
	

	public Student [] addStudent() {
		Scanner sc =new Scanner(System.in);
		System.out.println("학생의 인원수를 입력하시오");
		int num = sc.nextInt();
		
		Student []students = new Student[num];
		
		for(int i=0;i<num;i++) {
			Student student =new Student();
			System.out.println("이름 입력 : ");
			student.name = sc.next();
			System.out.println("번호 입력 : ");
			student.num =sc.nextInt();
			students[i]=student;			
		}
		return students;
	}
	
}
