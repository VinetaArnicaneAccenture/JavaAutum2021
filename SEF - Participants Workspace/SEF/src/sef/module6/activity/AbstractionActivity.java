package sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {

        Shape square = new Square(5);
        square.setColor("red");
        System.out.println("---Square information------------------------");
        System.out.println("Square color          : " + square.getColor());
        System.out.println("Square area          : " + square.calculateArea());
        System.out.println("Square perimeter         : " + square.calculatePerimeter());


        Shape rectangle = new Rectangle(5, 6);
        rectangle.setColor("green");
        System.out.println("---Rectangle information------------------------");
        System.out.println("Rectangle color          : " + rectangle.getColor());
        System.out.println("Rectangle area          : " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter         : " + rectangle.calculatePerimeter());


    }
}
