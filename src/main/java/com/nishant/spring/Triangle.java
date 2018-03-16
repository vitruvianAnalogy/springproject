package com.nishant.spring;

public class Triangle implements Shape{
	
	private String type;
	private int height;
	
	public Triangle (String type){
		this.type = type;
	}
	
	public Triangle(String type, int height){
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw(){
		System.out.println("Triangle BAM! " +getType()+" Hell yeah!!!! and " + getHeight() + " feet tall");
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	
	public void myInit(){
		System.out.println("This method runs when bean is created");
	}
	
	public void myDestroy(){
		System.out.println("This method runs when bean is destroyed");
	}
}
