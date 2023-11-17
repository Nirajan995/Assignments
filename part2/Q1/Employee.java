public class Employee extends Person {
 String office;
 double salary;
 MyDate dateHired;

 public Employee(String name, String address, String phone, String email, String office, double salary,
   MyDate dateHired) {
  super(name, address, phone, email);
  this.office = office;
  this.salary = salary;
  this.dateHired = dateHired;
 }
}
