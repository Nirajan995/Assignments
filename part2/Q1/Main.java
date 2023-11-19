public class Main {
 public static void main(String[] args) {
  // Testing the program
  Student student = new Student("John Doe", "123 Main St", "555-1234", "john@example.com", Status.SENIOR);
  System.out.println(student);

  Faculty facultyMember = new Faculty("Dr. Smith", "456 Oak St", "555-5678", "smith@example.com", "Office 101", 80000,
    new MyDate(2022, 1, 1), "Monday 2-4pm", "Professor");
  System.out.println(facultyMember);

  FullTime fullTimeStaff = new FullTime("Alice Johnson", "789 Elm St", "555-9101", "alice@example.com", "Office 201",
    60000, new MyDate(2022, 3, 15), "Manager");
  System.out.println(fullTimeStaff);
  System.out.println("Full-time staff salary: " + fullTimeStaff.calculateSalary());

  PartTime partTimeStaff = new PartTime("Bob Williams", "101 Pine St", "555-1122", "bob@example.com", "Office 301", 30,
    20, new MyDate(2022, 5, 1), "Assistant");
  System.out.println("Part-time staff salary: " + partTimeStaff.calculateSalary());
 }
}
