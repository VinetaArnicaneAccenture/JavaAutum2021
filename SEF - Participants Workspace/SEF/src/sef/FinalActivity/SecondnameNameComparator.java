package sef.FinalActivity;
/*
Author: Vineta Arnicane
 */

import java.util.Comparator;

class SecondnameNameComparator implements Comparator{
//Class compares employees bu secondName and name


    public int compare(Object emp1, Object emp2){

        //parameter are of type Object, so we have to downcast it to Employee objects

        String emp1Name = ((Employee)emp1).getSecondName()+((Employee)emp1).getName();
        String emp2Name = ((Employee)emp2).getSecondName()+((Employee)emp2).getName();

        //uses compareTo method of String class to compare names of the employee
        return emp1Name.compareTo(emp2Name);

    }

}

