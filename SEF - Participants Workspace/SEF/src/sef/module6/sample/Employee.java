package sef.module6.sample;

public class Employee extends Person {

    //Attributes
    private double salary;
    private String title;
    private String name;

    //Behavior - default constructor
    public Employee() {
        System.out.println("I'm an Employee Constructor");
    }

    // getter for double salary
    public double getSalary() {
        return salary;
    }

    // setter for double salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // getter for String title
    public String getTitle() {
        return title;
    }

    // setter for String title
    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "<Employee> " + name;
    }


}
