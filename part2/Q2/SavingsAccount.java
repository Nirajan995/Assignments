public class SavingsAccount extends Account {
 public SavingsAccount(String accountNumber, double balance, double annualInterestRate) {
  super(accountNumber, balance, annualInterestRate);
 }

 @Override
 public void withdraw(double amount) {
  if (amount > 0 && amount <= getBalance()) {
   super.withdraw(amount);
  } else {
   System.out.println("Invalid withdrawal amount or insufficient funds.");
  }
 }
}
