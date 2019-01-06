package com.hplus.sport.jsf;

public class Employee {

	private int ID;
	private String firstName;
	private String lastName;
	private String degree;
	private String title;
	private String photo;
	private String descreption;
	
	
	public Employee() {
		
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public String getDescreption() {
		return descreption;
	}


	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}

}
