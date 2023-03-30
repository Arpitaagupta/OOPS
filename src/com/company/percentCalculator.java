package com.company;
import java.util.Scanner;

public class percentCalculator {
    public static void main(String[] args) {
        /*
        Ques --> Write a program to calculate percentage of a given student in
                 CBSE board exam. His marks from 5 subjects must be taken as input
                 from keyboard.
                 (marks are out of 100)
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for subject 1 :");
        float s1 = sc.nextFloat();

        System.out.println("Enter marks for subject 2 :");
        float s2 = sc.nextFloat();

        System.out.println("Enter marks for subject 3 :");
        float s3 = sc.nextFloat();

        System.out.println("Enter marks for subject 4 :");
        float s4 = sc.nextFloat();

        System.out.println("Enter marks for subject 5 :");
        float s5 = sc.nextFloat();

        float total_marks = s1+s2+s3+s4+s5;
        float percentage = (total_marks/500)*100;

        System.out.println("Percentage scored by student : " +percentage);
    }
}
