package sef.FinalActivity;
/*
Author: Vineta Arnicane
Calculates Fibonacci numbers
 */

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class FibonacciNumbers {

    public static String fibonacci(int count)
    {
        String result="";   //there will be string with Fibonacci numbers storesd

        ArrayList<Integer> list = new ArrayList<Integer>();   // list for Fibonacci numbers

        if (count>=1) {
            list.add(0);     //first Fibunacci number
        }
        if (count>=2) {
            list.add(1);    //second Fibunacci number
        }

        for (int i=2; i<count; i++) {   //calculate all Fibonacci numbers needed
            int sum = 0;
            int size = list.size();
            int num1 = ((int) list.get(list.size() - 1));
            int num2 = list.get(list.size()-2);
            sum = num1+num2;
            list.add(sum);
        }


        Iterator<Integer> it = list.iterator();   //make String of Fibonacci numbers
        while (it.hasNext()){
            int elem = it.next();
            result= result + " " + elem;

        }

        return result;

    }



    public static void main(String arg[]){

        // give as an argument the count of Fibonacci numbers
        String aa=fibonacci(10);
        System.out.println("Fibonacci numbers are:" + aa);
    }
}

