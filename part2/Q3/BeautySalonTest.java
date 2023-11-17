public class BeautySalonTest {
 public static void main(String[] args) {
  // Test program
  Customer premiumCustomer = new Customer("John Doe", "Premium");
  Visit visit1 = new Visit(premiumCustomer, 50.0, 100.0);
  visit1.display();

  System.out.println();

  Customer goldCustomer = new Customer("Jane Smith", "Gold");
  Visit visit2 = new Visit(goldCustomer, 30.0, 80.0);
  visit2.display();

  System.out.println();

  Customer silverCustomer = new Customer("Bob Johnson", "Silver");
  Visit visit3 = new Visit(silverCustomer, 40.0, 120.0);
  visit3.display();

  System.out.println();

  Customer regularCustomer = new Customer("Alice White", "Regular");
  Visit visit4 = new Visit(regularCustomer, 60.0, 150.0);
  visit4.display();
 }
}
