package sef.FinalActivity;
/*
Author: Vineta Arnicane
 */

public class Students extends Person {
    // class meant for any student
    // Specification:
    /*
        4) in file Students
        3.1 Create file students from scratch
        3.2 Add method for introduce of person ->
        "I am study in university <schoolName>"
     */

    //Attributes
    private String schoolName;

    //Constructors
    public Students() {}
    public Students(String name, int age, String schoolName ) {
        this.name=name;
        this.age=age;
        this.schoolName=schoolName;
    }

    //Methods
    public void setSchoolName(String schoolName) {
        try {
            if (schoolName == null) {
                throw new Exception ("SchoolName cannot be null");
            } else{
                this.schoolName = schoolName;;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String introduceMyself() {
//        String returnText = "My name is " + name " and i am " + age + " years old I am study in university " + schoolName;
        String returnText = super.introduceMyself() + "\r\n" + "I am study in university " + schoolName;
        return returnText;
    }


}
