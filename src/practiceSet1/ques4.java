package practiceSet1;
import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        //Question-4
        //Write a Java program to convert Kilometers to miles.

        // 1km = 0.621371 miles

        System.out.println("Enter the value in kilo metres : ");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();

        System.out.println("Value in miles is : " + km * 0.621371 + " miles.");
    }
}
