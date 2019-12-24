package com.syntax.class11;

public abstract class Shape2D {
	
	String color;
	
	public Shape2D(String color) {
		this.color = color;
	}
	
	public abstract int calculateArea();
	
	public abstract int calculatePerimeter();

}
