package sef.FinalActivity;
/*
Author: Vineta Arnicane
 */


import sef.FinalActivity.Employee;
import java.util.*;
import java.util.Comparator;

public class SalaryComparator implements Comparator{
    //class compares objects of Employee by salary

    public int compare(Object emp1, Object emp2){

        int emp1Salary = ((Employee)emp1).getSalary();
        int emp2Salary = ((Employee)emp2).getSalary();

        if(emp1Salary > emp2Salary)
            return 1;
        else if(emp1Salary < emp2Salary)
            return -1;
        else
            return 0;
    }

}