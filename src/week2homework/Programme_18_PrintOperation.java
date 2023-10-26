package week2homework;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme_18_PrintOperation {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please Enter Second number: ");
        int secondNumber = scanner.nextInt();
        Programme_18_PrintOperation printOperation = new Programme_18_PrintOperation();
        printOperation.printTheOperation(firstNumber,secondNumber);
        //Close the scanner
        scanner.close();
    }

    // Printing the all operations
    public void printTheOperation(int a, int b) {
        System.out.println("The sum of " + a + " is " + (a + b));
        System.out.println("The difference of " + a + " and " + b + " is = " + (a / b));
        System.out.println("The Product of " + a + " and " + b + " is = " + (a * b));
        System.out.println("The Division of " + a + " and " + b + " is = " + (a / b));
        System.out.println("The  Reminder of " + a + " and " + b + " is = " + (a % b));
    }
}
