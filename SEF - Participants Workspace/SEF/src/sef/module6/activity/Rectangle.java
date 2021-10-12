package sef.module6.activity;

public class Rectangle extends Shape {

    public double length;
    public double breadth;

    public Rectangle() { this.length=0;this.breadth=0; }
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double

    public double calculateArea() {
        area=length*breadth;
        return area;
    }
    public double calculatePerimeter() {
        perimeter=2*(length+breadth);
        return perimeter;
    }


}

