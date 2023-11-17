public class CheckingAccount extends Account {
 private double overdraftLimit;

 public CheckingAccount(String accountNumber, double balance, double annualInterestRate, double overdraftLimit) {
  super(accountNumber, balance, annualInterestRate);
  this.overdraftLimit = overdraftLimit;
 }

 public double getOverdraftLimit() {
  return overdraftLimit;
 }

 @Override
 public void withdraw(double amount) {
  if (amount > 0 && (getBalance() - amount) >= -overdraftLimit) {
   super.withdraw(amount);
  } else {
   System.out.println("Invalid withdrawal amount or exceeding overdraft limit.");
  }
 }
}
