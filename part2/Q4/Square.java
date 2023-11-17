public class Square extends GeometricObject implements Colorable {
 int length = 10;

 // Implement area calculation for a square
 @Override
 public double getArea() {
  return length * length;
 }

 @Override
 public void howToColor() {
  System.out.println("Color the square by filling it with your favorite color.");
 }
}
