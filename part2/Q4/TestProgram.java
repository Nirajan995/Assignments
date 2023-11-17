public class TestProgram {
 public static void main(String[] args) {
  Circle circle1 = new Circle(5);
  Circle circle2 = new Circle(7);

  Cylinder cylinder1 = new Cylinder(3, 8);
  Cylinder cylinder2 = new Cylinder(4, 10);

  ComparableCylinder compCylinder1 = new ComparableCylinder(2, 6);
  ComparableCylinder compCylinder2 = new ComparableCylinder(3, 9);

  // Find the larger of two circles
  Circle largerCircle = (Circle) GeometricObject.max(circle1, circle2);
  System.out.println("Larger Circle Area: " + largerCircle.getArea());

  // Find the larger of two cylinders
  Cylinder largerCylinder = (Cylinder) GeometricObject.max(cylinder1, cylinder2);
  System.out.println("Larger Cylinder Volume: " + ((Cylinder) largerCylinder).getVolume());

  // Find the larger of two ComparableCylinders
  ComparableCylinder largerCompCylinder = (ComparableCylinder) GeometricObject.max(compCylinder1, compCylinder2);
  System.out.println("Larger ComparableCylinder Volume: " + largerCompCylinder.getVolume());

  // Color the square
  Square square = new Square();
  square.howToColor();
 }
}
