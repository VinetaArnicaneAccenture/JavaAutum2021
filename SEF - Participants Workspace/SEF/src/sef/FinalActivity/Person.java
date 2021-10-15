package sef.FinalActivity;
/*
Author: Vineta Arnicane
 */

public class Person {
    // class meant as super class for any person
    // Specification:
    /*
        2) in file Person
        1.1 Based on code implement Person attributes
        1.2 Add method for introduce of person ->
        "My name is <name> and i am <age> years old"
    */

    //Attributes
    protected String name;
    protected String secondName;
    protected int age;
    boolean aa;


    //Constructors
    public Person() {}
    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    public Person(String name, String secondName, int age) {
        this.setName(name);
        this.setName(secondName);
        this.setAge(age);
    }

    //Methods
    public void setName(String name) {
        try {
            if (name == null) {
                throw new Exception ("Name cannot be null");
            } else{
                int cc = 0;
                cc = cc + name.indexOf("0");
                cc = cc + name.indexOf("1");
                cc = cc + name.indexOf("2");
                cc = cc + name.indexOf("3");
                cc = cc + name.indexOf("4");
                cc = cc + name.indexOf("5");
                cc = cc + name.indexOf("6");
                cc = cc + name.indexOf("7");
                cc = cc + name.indexOf("8");
                cc = cc + name.indexOf("9");
                if (cc > -10) {
                    throw new IllegalArgumentException("Person's name contains numbers: " + name);
                } else {
                    this.name = name;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String getName() {
        return name;
    }

    public void setSecondName(String name) {
        try {
            if (name == null) {
                throw new Exception ("SecondName cannot be null");
            } else{
                int cc = 0;
                cc = cc + name.indexOf("0");
                cc = cc + name.indexOf("1");
                cc = cc + name.indexOf("2");
                cc = cc + name.indexOf("3");
                cc = cc + name.indexOf("4");
                cc = cc + name.indexOf("5");
                cc = cc + name.indexOf("6");
                cc = cc + name.indexOf("7");
                cc = cc + name.indexOf("8");
                cc = cc + name.indexOf("9");
                if (cc > -10) {
                    throw new IllegalArgumentException("Person's name contains numbers: " + name);
                } else {
                    this.secondName = name;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String getSecondName() {
        return secondName;
    }



    public void setAge(int age) {
        try {
            if (age<0) {
                throw new Exception ("Age cannot be negative:" + age);
            } else{
                this.age = age;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getAge() {
        return age;
    }

    public String introduceMyself() {
        String returnText = "My name is " + name + " and i am " + age + " years old";
        return returnText;
    }



}
