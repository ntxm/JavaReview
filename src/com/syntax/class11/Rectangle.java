package com.syntax.class11;

public class Rectangle extends Shape2D{
	
	int width;
	int height;
	String color;
	
	public Rectangle(int width, int height, String color) {
		super(color);
		this.width = width;
		this.height = height;
		//this.color = color;
	}
	
	public int calculateArea() {
		return width * height;
	}
	
	public int calculatePerimeter() {
		return 2 * (width + height);
	}
}
