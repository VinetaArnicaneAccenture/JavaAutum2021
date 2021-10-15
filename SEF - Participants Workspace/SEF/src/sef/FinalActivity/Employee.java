package sef.FinalActivity;
/*
Author: Vineta Arnicane
 */

public class Employee extends Person {
    // class meant for any employee
    // Specification:
    /*
        3) In file Employee
        2.1 Add different constructors
        2.2 Add getters and setters
        2.3 Add method for introduce of person ->
        "My name is <name> and i am <age> years old
        I am work as <jobTitle> in <company>"
    */

    //Attributes
    private String jobTitle;
    private String company;
    private int salary;

    //Constructors
    public Employee() {}
    public Employee(String name, int age, String company, String jobTitle, int salary) {
        this.setName(name);
        this.setAge(age);
        this.setCompany(company);
        this.setJobTitle(jobTitle);
        this.setSalary(salary);
    }
    public Employee(String name, String secondName, int age, String company, String jobTitle, int salary) {
        this.setName(name);
        this.setSecondName(secondName);
        this.setAge(age);
        this.setCompany(company);
        this.setJobTitle(jobTitle);
        this.setSalary(salary);
    }

    //Methods
    public void setJobTitle(String jobTitle) {
        try {
            if (jobTitle == null) {
                throw new Exception ("JobTitle cannot be null");
            } else{
                this.jobTitle = jobTitle;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public void setCompany(String company) {
        try {
            if (company == null) {
                throw new Exception ("Company cannot be null");
            } else{
                this.company = company;;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCompany() {
        return company;
    }

    public void setSalary(int salary) {
        try {
            if (salary<0) {
                throw new Exception ("Age cannot be negative:" + salary);
            } else{
                this.salary = salary;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getSalary() {
        return salary;
    }


    public String introduceMyself() {
//        String returnText = "My name is " + name " and i am " + age + " years old I am work as " + jobTitle + " in " <company>";
        String returnText = super.introduceMyself() + "\r\n" + "I am work as " + jobTitle + " in " + company;
        return returnText;
    }


}
