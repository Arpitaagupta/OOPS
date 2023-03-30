package practiceSet1;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        //Question-5
        //Write a Java program to detect whether a number entered by the user is an integer or not.

        System.out.println("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
