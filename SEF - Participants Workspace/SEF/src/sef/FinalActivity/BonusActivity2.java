package sef.FinalActivity;
/*
Author: Vineta Arnicane
 */

import java.util.Arrays;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class


public class BonusActivity2 {

    // Specification:
    /*
        2) Try to save employee list in to TXT file on HDD
     */

    public static void main(String arg[]) {

        Employee employeeArray[] = new Employee[3];

        employeeArray[0] = new Employee("Juris", 37, "VC4", "accountant", 1500);
        employeeArray[1] = new Employee("Anna", 56, "LMT", "operator", 4000);
        employeeArray[2] = new Employee("John", 45, "LU", "researcher", 2000);

        Arrays.sort(employeeArray, new SalaryComparator());

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            int j=1;
            for (int i = employeeArray.length-1; i >=0 ; i--) {
                myWriter.write("Employee " + j + ". Name :: " + employeeArray[i].getName() + ", Company :: " + employeeArray[i].getCompany() + ", JobTitle :: " + employeeArray[i].getJobTitle()+ ", Salary :: " + employeeArray[i].getSalary());
                myWriter.write("\r\n" );
                j++;
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}

