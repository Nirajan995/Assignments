
public class Fan {

 public static final int SLOW = 1;
 public static final int MEDIUM = 2;
 public static final int FAST = 3;

 private int speed = SLOW;
 private boolean on = false;
 private double radius = 5;
 private String color = "blue";

 public Fan() {
 }

 public Fan(int speed, boolean on, double radius, String color) {
  this.speed = speed;
  this.on = on;
  this.radius = radius;
  this.color = color;
 }

 public int getSpeed() {
  return speed;
 }

 public void setSpeed(int speed) {
  if (speed < SLOW || speed > FAST) {
   throw new IllegalArgumentException("Invalid speed");
  }
  this.speed = speed;
 }

 public boolean isOn() {
  return on;
 }

 public void setOn(boolean on) {
  this.on = on;
 }

 public double getRadius() {
  return radius;
 }

 public void setRadius(double radius) {
  if (radius < 0) {
   throw new IllegalArgumentException("Invalid radius");
  }
  this.radius = radius;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 @Override
 public String toString() {
  if (on) {
   return String.format("Fan{speed=%d, on=true, radius=%f, color='%s'}", speed, radius, color);
  } else {
   return String.format("Fan{speed=%d, on=false, radius=%f, color='%s'}", speed, radius, color);
  }
 }
}
