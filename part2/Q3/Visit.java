public class Visit {
 private Customer customer;
 private double serviceExpense;
 private double productExpense;

 public Visit(Customer customer, double serviceExpense, double productExpense) {
  this.customer = customer;
  this.serviceExpense = serviceExpense;
  this.productExpense = productExpense;
 }

 public double getTotalExpense() {
  double serviceDiscount = serviceExpense * Discount.getServiceDiscountRate(customer.getMembership());
  double productDiscount = productExpense * Discount.getProductDiscountRate();
  return serviceExpense - serviceDiscount + productExpense - productDiscount;
 }

 public void display() {
  System.out.println("Customer: " + customer.getName());
  System.out.println("Service Expense: $" + serviceExpense);
  System.out.println("Product Expense: $" + productExpense);
  System.out.println("Total Expense: $" + getTotalExpense());
 }
}
