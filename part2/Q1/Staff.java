public class Staff extends Employee {
 String title;

 public Staff(String name, String address, String phone, String email, String office, double salary, MyDate dateHired,
   String title) {
  super(name, address, phone, email, office, salary, dateHired);
  this.title = title;
 }
}
