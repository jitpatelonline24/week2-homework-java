package week2homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Programme_17_DecimalToBinary {

    public static void main(String[] args) {
        //Scanner declaration for reading input form people
        System.out.println("Welcome to Java program to convert decimal to binary number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Decimal Number: ");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        //Close the scanner
        scanner.close();
    }

    //Converting decimal to binary
    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }
}
