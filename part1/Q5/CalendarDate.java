import java.util.GregorianCalendar;

public class CalendarDate {
 public static void main(String[] args) {
  // Create a GregorianCalendar instance for the current date
  GregorianCalendar calendar = new GregorianCalendar();

  // Get the current year, month, and day
  int year = calendar.get(GregorianCalendar.YEAR);
  int month = calendar.get(GregorianCalendar.MONTH) + 1; // Month is 0-based, so add 1
  int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

  // Display the current year, month, and day
  System.out.println("Current Year: " + year);
  System.out.println("Current Month: " + month);
  System.out.println("Current Day: " + day);
 }
}
