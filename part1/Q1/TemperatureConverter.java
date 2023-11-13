// 1. Write a program that reads a Fahrenheit degree in double,
// then converts it to Celsius and displays the result on the console. The formula for the conversion is as follows:

import java.util.Scanner;

public class TemperatureConverter {
 private double fahrenheit;
 private double celsius;

 public void setFahrenheit(double fahrenheit) {
  this.fahrenheit = fahrenheit;
 }

 public double convertToFahrenheit() {
  return fahrenheit;
 }

 public double convertToCelsius() {
  celsius = (fahrenheit - 32) * 5 / 9;
  return celsius;
 }

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter temperature in Fahrenheit: ");
  double fahrenheitInput = scanner.nextDouble();

  TemperatureConverter converter = new TemperatureConverter();
  converter.setFahrenheit(fahrenheitInput);

  System.out.println("Temperature in Fahrenheit: " + converter.convertToFahrenheit());
  System.out.println("Temperature in Celsius: " + converter.convertToCelsius());

  scanner.close();
 }
}
