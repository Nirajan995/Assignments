public class Account {
 private String accountNumber;
 private double balance;
 private double annualInterestRate;

 public Account(String accountNumber, double balance, double annualInterestRate) {
  this.accountNumber = accountNumber;
  this.balance = balance;
  this.annualInterestRate = annualInterestRate;
 }

 public String getAccountNumber() {
  return accountNumber;
 }

 public double getBalance() {
  return balance;
 }

 public double getAnnualInterestRate() {
  return annualInterestRate;
 }

 public void deposit(double amount) {
  if (amount > 0) {
   balance += amount;
   System.out.println("Deposit successful. New balance: " + balance);
  } else {
   System.out.println("Invalid deposit amount.");
  }
 }

 public void withdraw(double amount) {
  if (amount > 0 && amount <= balance) {
   balance -= amount;
   System.out.println("Withdrawal successful. New balance: " + balance);
  } else {
   System.out.println("Invalid withdrawal amount or insufficient funds.");
  }
 }

 public void calculateInterest() {
  double interest = balance * (annualInterestRate / 100);
  System.out.println("Interest earned: " + interest);
 }
}
