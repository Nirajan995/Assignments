// Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 943, the sum of all its digit is 16.

import java.util.Scanner;

public class SumOfDigits {
 private int number;

 // Constructor
 public SumOfDigits(int number) {
  this.number = number;
 }

 // Method to calculate the sum of digits
 public int calculateDigitSum() {
  int sum = 0;
  int tempNumber = number;

  while (tempNumber != 0) {
   sum += tempNumber % 10;
   tempNumber /= 10;
  }

  return sum;
 }

 public static void main(String[] args) {
  // Create Scanner object to read input from the user
  Scanner scanner = new Scanner(System.in);

  // Prompt the user to enter an integer between 0 and 1000
  System.out.print("Enter an integer between 0 and 1000: ");

  // Read the input
  int inputNumber = scanner.nextInt();

  // Validate input range
  if (inputNumber < 0 || inputNumber > 1000) {
   System.out.println("Please enter a valid integer between 0 and 1000.");
  } else {
   // Create an instance of DigitSumCalculator
   SumOfDigits calculator = new SumOfDigits(inputNumber);

   // Calculate and display the sum of digits
   int digitSum = calculator.calculateDigitSum();
   System.out.println("The sum of digits in " + inputNumber + " is: " + digitSum);
  }

  // Close the scanner to avoid resource leaks
  scanner.close();
 }
}
