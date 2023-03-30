package practiceSet1;
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        //Question-3
        //Write a Java program that asks the user to enter his/her name
        // and greets them with “Hello <name>, have a good day” text.

        System.out.println("Enter your name : ");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("Hello " +name+ ", have a good day.");


    }
}
