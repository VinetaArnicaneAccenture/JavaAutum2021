package sef.module6.activity;

public abstract class Shape {

	public String color;
	public double area;
	public double perimeter;
	
	public Shape() {
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double

	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
          return color;
	}
	abstract public double calculateArea();
	abstract public double calculatePerimeter();
	

}

