public class Main {
 public static void main(String[] args) {
  CheckingAccount checking = new CheckingAccount("C12345", 1000, 2.5, 500);
  SavingsAccount savings = new SavingsAccount("S67890", 2000, 3.0);

  checking.deposit(500);
  checking.withdraw(800);
  checking.calculateInterest();

  savings.deposit(1000);
  savings.withdraw(300);
  savings.calculateInterest();
 }
}
