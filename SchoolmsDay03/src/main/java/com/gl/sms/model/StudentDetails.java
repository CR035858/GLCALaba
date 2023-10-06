package com.gl.sms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="studentfName")
	String studentfName;
	
	@Column(name="studentlName")
	String studentlName;
	
	@Column(name="grade")
	String grade;
	
	@Column(name="section")
	String section;
	
	@Column(name="classTeacher")
	String classTeacher;
	
	public StudentDetails() {
		super();
	}

	public StudentDetails(String studentfName, String studentlName, String grade, String section, String classTeacher) {
		super();
		this.studentfName = studentfName;
		this.studentlName = studentlName;
		this.grade = grade;
		this.section = section;
		this.classTeacher = classTeacher;
	}

	public StudentDetails(int id, String studentfName, String studentlName, String grade, String section,
			String classTeacher) {
		super();
		this.id = id;
		this.studentfName = studentfName;
		this.studentlName = studentlName;
		this.grade = grade;
		this.section = section;
		this.classTeacher = classTeacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentfName() {
		return studentfName;
	}

	public void setStudentfName(String studentfName) {
		this.studentfName = studentfName;
	}

	public String getStudentlName() {
		return studentlName;
	}

	public void setStudentlName(String studentlName) {
		this.studentlName = studentlName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", studentfName=" + studentfName + ", studentlName=" + studentlName
				+ ", grade=" + grade + ", section=" + section + ", classTeacher=" + classTeacher + "]";
	}
	
	
	
	

}
