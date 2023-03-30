package com.company;
import java.util.Scanner;
//Reading data from the keyboard
//In order to read data from the keyboard,
// Java has a scanner class.

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From User");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
       //int a = sc.nextInt();
      float a = sc.nextFloat();

      //  boolean b1 = sc.hasNextInt(); //--> true if it is integer otherwise returns false
      //  System.out.println(b1);


       System.out.println("Enter number 2 : ");
       //int b = sc.nextInt();
      float b = sc.nextFloat();

        float sum = a+b;

       System.out.println("Sum of number 1 and 2 : " + sum);

       //taking string input
        String str1 = sc.next(); //--> reads only first word, stops after white space
        String str2 = sc.nextLine(); //-->reads the complete line including white spaces


        //System.out.println(str1);
        System.out.println(str2);
    }
}
