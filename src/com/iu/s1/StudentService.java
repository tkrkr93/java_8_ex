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
	//2. 학생입력 - 메서드명 addPoint
	//각 학생의 점수 입력 + 총점과 평균계산
	public void addPoint(Student [] students){
		Scanner sc =new Scanner(System.in); //new 이면 새로 생성하는것 
		//학생의 정보 입력
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name+"학생의 국어점수는");
			students[i].kor=sc.nextInt();
			System.out.println(students[i].name+"학생의 영어점수는");
			students[i].eng =sc.nextInt();
			System.out.println(students[i].name+"학생의 수학점수는");
			students[i].math =sc.nextInt();

			students[i].total =students[i].kor+students[i].math+students[i].eng;
			students[i].avg =students[i].total/3.0;
						
		}
	}
}
