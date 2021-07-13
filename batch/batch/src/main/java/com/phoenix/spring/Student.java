package com.phoenix.spring;

public class Student {

	int stid;
	String stname;
	int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int v1, String v2, int v3)
	{
		stid=v1;
		stname=v2;
		marks=v3;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
