import java.util.TimeZone;

public class Time {

 private int hour;
 private int minute;
 private int second;

 // No-arg constructor sets the time for the current time in GMT
 public Time() {
  setTime(System.currentTimeMillis());
 }

 // Constructor to set the time using a specified elapsed time
 public Time(long elapsedTime) {
  setTime(elapsedTime);
 }

 // Set the time based on the elapsed time
 private void setTime(long elapsedTime) {
  // Obtain the total seconds since the epoch
  long totalSeconds = elapsedTime / 1000;

  // Compute the current second
  second = (int) (totalSeconds % 60);

  // Obtain the total minutes
  long totalMinutes = totalSeconds / 60;

  // Compute the current minute
  minute = (int) (totalMinutes % 60);

  // Obtain the total hours
  long totalHours = totalMinutes / 60;

  // Compute the current hour
  hour = (int) (totalHours % 24);
 }

 // Getter method for the hour
 public int getHour() {
  return hour;
 }

 // Getter method for the minute
 public int getMinute() {
  return minute;
 }

 // Getter method for the second
 public int getSecond() {
  return second;
 }

 public static void main(String[] args) {
  // Create a Time object for the current time in GMT
  Time currentTime = new Time();

  // Display the current hour, minute, and second
  System.out.println("Current Time (GMT):");
  System.out.println("Hour: " + currentTime.getHour());
  System.out.println("Minute: " + currentTime.getMinute());
  System.out.println("Second: " + currentTime.getSecond());
 }
}
