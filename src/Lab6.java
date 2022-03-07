import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int num1, num2, difference;

        System.out.print("Enter number 1: ");
        num1 = scnr.nextInt();

        System.out.print("Enter number 2: ");
        num2 = scnr.nextInt();

        difference = num1 - num2;

        System.out.println("\nThe difference is " + difference);
    }
}
