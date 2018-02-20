package com.iu.s1;

public class Main {

	public static void main(String[] args) {
		
		SchoolController sc = new SchoolController();
		sc.start();
		//이 식도 가능 new SchoolController().start();(위의 두개를 한줄로 줄인것)-한번 호출하고 말 것들은 이런식으로 사용
		
		StudentService ss = new  StudentService();
		StudentView sv =new StudentView();
		Student student =new Student();
		System.out.println("Program Start");

		
	}

}
