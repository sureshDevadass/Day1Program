package com.onesoft.day1;

public class StudentAverage {
	public static void main(String[] args) {
		
	
	String studentName="Suresh";
	int rollNo=58;
	int tamilMark=60;
	int englishMark=65;
	int mathsMark=68;
	int scienceMark=70;
	int socialMark=63;
	int totalMark;
	
	totalMark=tamilMark+englishMark+mathsMark+scienceMark+socialMark;
	float average=(totalMark/5f);
	
	System.out.println("Student Name:" + studentName);
	System.out.println("Total : "+totalMark);
	System.out.println("Average : "+ average+ "%");
	
	} 
}
