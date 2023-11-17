public class PartTime extends Staff {
 double hourlyRate;
 int hoursWorked;

 public PartTime(String name, String address, String phone, String email, String office, double hourlyRate,
   int hoursWorked, MyDate dateHired, String title) {
  super(name, address, phone, email, office, 0, dateHired, title);
  this.hourlyRate = hourlyRate;
  this.hoursWorked = hoursWorked;
 }

 // Calculate salary for part-time staff
 public double calculateSalary() {
  return hourlyRate * hoursWorked;
 }
}
