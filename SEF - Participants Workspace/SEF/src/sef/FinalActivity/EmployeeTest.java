package sef.FinalActivity;
/*
Author: Vineta Arnicane
 */

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
    // class is meant for testing of classes Person, Employee and Students; aim - achieve full statement coverage
    // Specification:
    /*
        6) Create unit test for ALL classes (example in EmployeeTest)
        Try to achieve 100% of coverage
    */

    private Employee myEmployee;

    private Students myStudents;
    private Person myPerson;

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        myEmployee= new Employee();
        myPerson=new Person();
        myStudents=new Students();
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////
    //Tests for class Person

    public void testPersonSetAndGetName() {
        String myName = "Anna";
        assertNull(myPerson.getName());
        myPerson.setName(myName);
        assertEquals(myName, myPerson.getName());
    }

    public void testPersonSetAndGetName2() {
        String oldName = myPerson.getName();
        String myName = "Anna3";
        myPerson.setName(myName);
        assertEquals(oldName, myPerson.getName());
    }

    public void testPersonSetAndGetSecondName() {
        String testString = "Grēviņa";
        assertNull(myPerson.getSecondName());
        myPerson.setSecondName(testString);
        assertEquals(testString, myPerson.getSecondName());
        myPerson.setSecondName("1234");
        assertEquals(testString, myPerson.getSecondName());
    }


    public void testPersonSetAndGetAge() {
        int myAge = 17;
        assertEquals(0, myPerson.getAge());
        myPerson.setAge(myAge);
        assertEquals(myAge, myPerson.getAge());
        int myNewAge = -17;
        myPerson.setAge(myNewAge);
        assertEquals(myAge, myPerson.getAge());

    }

    public void testPersonIntroduceMyself() {
        String expectedText = "My name is " + myPerson.getName() + " and i am " + myPerson.getAge() + " years old";;
        assertEquals(expectedText, myPerson.introduceMyself());
    }

    public void testPersonParametrizedConstructor() {
        String myName = "Anna";
        int myAge= 20;
        Person newPerson = new Person(myName, myAge);
        String expectedText = "My name is " + newPerson.getName() + " and i am " + newPerson.getAge() + " years old";;
        assertEquals(expectedText, newPerson.introduceMyself());
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////
    //Tests for class Employee

    public void testEmployeeSetAndGetJobTitle() {
        String testString = "manager";
        assertNull(myEmployee.getJobTitle());
        myEmployee.setJobTitle(testString);
        assertEquals(testString, myEmployee.getJobTitle());
        myEmployee.setJobTitle(null);
        assertEquals(testString, myEmployee.getJobTitle());

    }

    public void testEmployeeSetAndGetCompany() {
        String testString = "LMT";
        assertNull(myEmployee.getCompany());
        myEmployee.setCompany(testString);
        assertEquals(testString, myEmployee.getCompany());
        myEmployee.setCompany(null);
        assertEquals(testString, myEmployee.getCompany());
    }

    public void testEmployeeSetAndGetSalary() {
        int testInt = 2000;
        assertEquals(0, myEmployee.getSalary());
        myEmployee.setSalary(testInt);
        assertEquals(testInt, myEmployee.getSalary());
        myEmployee.setSalary(-100);
        assertEquals(testInt, myEmployee.getSalary());

    }

    public void testEmployeeIntroduceMyself() {
        String expectedText = "My name is " + myEmployee.getName() + " and i am " + myEmployee.getAge() + " years old" + "\r\n" + "I am work as " + myEmployee.getJobTitle() + " in " + myEmployee.getCompany();
        assertEquals(expectedText, myEmployee.introduceMyself());
    }

    public void testEmployeeParametrizedConstructor() {
        String myName = "Anna";
        int myAge= 20;
        String myCompany = "LMT";
        String myJobTitle = "manager";
        int mySalary = 1500;
        Employee newEmployee = new Employee(myName, myAge, myCompany, myJobTitle, mySalary);
        String expectedText = "My name is " + myName + " and i am " + myAge + " years old" + "\r\n" + "I am work as " + myJobTitle + " in " + myCompany;
        assertEquals(expectedText, newEmployee.introduceMyself());
        assertEquals(mySalary, newEmployee.getSalary());
    }

/////////////////////////////////////////////////////////////////////////////////////////////////
    //Tests for class Students

    public void testStudentsSetAndGetSchoolName() {
        String testString = "LU";
        assertNull(myStudents.getSchoolName());
        myStudents.setSchoolName(testString);
        assertEquals(testString, myStudents.getSchoolName());
        myStudents.setSchoolName(null);
        assertEquals(testString, myStudents.getSchoolName());
    }

     public void testStudentsIntroduceMyself() {
        String expectedText = "My name is " + myStudents.getName() + " and i am " + myStudents.getAge() + " years old" + "\r\n" + "I am study in university " + myStudents.getSchoolName();
        assertEquals(expectedText, myStudents.introduceMyself());
    }

    public void testStudentsParametrizedConstructor() {
        String myName = "Anna";
        int myAge= 20;
        String mySchool="RTU";
        Students newStudents = new Students(myName, myAge, mySchool);
        String expectedText = "My name is " + myName + " and i am " + myAge + " years old" + "\r\n" + "I am study in university " + mySchool;
        assertEquals(expectedText, newStudents.introduceMyself());
    }

/////////////////////////////////////////////////////////////////////////////////////////////////

}
