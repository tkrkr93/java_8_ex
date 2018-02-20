package com.iu.s1;

public class StudentView {
//학생들의 정보를 출력하는 클래스
//메서드명 : view 
//학생들의 정보를 출력 ->4번 눌렀을때 실행 
	public void view(Student [] students) {
		for(int i=0;i<students.length;i++) {
			
			System.out.println("학생의 이름 : "+students[i].name);
			System.out.println("학생의 번호 : "+students[i].num);
			System.out.println("학생의 국어 : "+students[i].kor);
			System.out.println("학생의 영어 :"+students[i].eng);
			System.out.println("학생의 수학 : "+students[i].math);
			System.out.println("합계 : "+students[i].total);
			System.out.println("평균 : "+students[i].avg);	
			
		}
	
	}
}
