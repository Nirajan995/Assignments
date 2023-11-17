public class Student extends Person {
 Status status;

 public Student(String name, String address, String phone, String email, Status status) {
  super(name, address, phone, email);
  this.status = status;
 }
}
