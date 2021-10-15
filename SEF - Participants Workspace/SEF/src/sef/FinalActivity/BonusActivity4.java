package sef.FinalActivity;
/*
Author: Vineta Arnicane
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class BonusActivity4
{
    // Specification:
    /*
         4) Sort employees by first and second name
    */

    public static void main(String arg[]) {

        Employee employeeArray[] = new Employee[3];

        employeeArray[0] = new Employee("Juris","Trumps", 37, "VC4", "accountant", 1500);
        employeeArray[1] = new Employee("Anna","Lapa", 56, "LMT", "operator", 4000);
        employeeArray[2] = new Employee("John", "Brown", 45, "LU", "researcher", 2000);

        Arrays.sort(employeeArray, new SecondnameNameComparator());

//        Arrays.sort(employeeArray, new SalaryComparator());
//        System.out.println("\n\nOrder of employee from top salary to less is");
        int j=1;
        for (int i =0; i< employeeArray.length; i++) {
            System.out.println("Employee " + j + ". Second Name :: " + employeeArray[i].getSecondName() + ", Name :: " + employeeArray[i].getName());
            j++;
        }

    }

}

