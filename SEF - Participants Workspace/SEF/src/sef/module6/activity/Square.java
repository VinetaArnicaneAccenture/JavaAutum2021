package sef.module6.activity;

public class Square extends Shape {

    public double side;

    public Square() { this.side=0; }
    public Square(double side) {
        this.side = side;
    }
    // Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double

    public double calculateArea() {
        area=side*side;
        return area;
    }
    public double calculatePerimeter() {
        perimeter=4*side;
        return perimeter;
    }


}
