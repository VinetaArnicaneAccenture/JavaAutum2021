package sef.FinalActivity;
/*
Author: Vineta Arnicane
 */

import java.util.Arrays;

public class FirstActivity {
    // Specification:
    /*
        5) in file FirstActivity
        4.1 create few employees
        4.2 try to print them from top salary to less
     */

    public static void main(String arg[]) {

        Employee employeeArray[] = new Employee[3];

        employeeArray[0] = new Employee("Juris", 37, "VC4", "accountant", 1500);
        employeeArray[1] = new Employee("Anna", 56, "LMT", "operator", 4000);
        employeeArray[2] = new Employee("John", 45, "LU", "researcher", 2000);

        Arrays.sort(employeeArray, new SalaryComparator());
        System.out.println("\n\nOrder of employee from top salary to less is");

        for (int i = employeeArray.length-1; i >=0 ; i--) {
            System.out.println("Employee " + (i + 1) + " name :: " + employeeArray[i].getName() + ", Salary :: " + employeeArray[i].getSalary());
         }
    }

}
