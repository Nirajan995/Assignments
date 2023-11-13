public class RectangleTest {

  public static class Rectangle {

    private double width;
    private double height;
    private static String color = "yellow";

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
    }

    public double getWidth() {
      return width;
    }

    public void setWidth(double width) {
      this.width = width;
    }

    public double getHeight() {
      return height;
    }

    public void setHeight(double height) {
      this.height = height;
    }

    public static String getColor() {
      return color;
    }

    public static void setColor(String color) {
      Rectangle.color = color;
    }

    public double findArea() {
      return width * height;
    }

    public double findPerimeter() {
      return 2 * (width + height);
    }

    @Override
    public String toString() {
      return "Rectangle{" +
          "width=" + width +
          ", height=" + height +
          ", color='" + color + '\'' +
          '}';
    }
  }

  public static void main(String[] args) {
    // Create two Rectangle objects
    Rectangle rectangle1 = new Rectangle(5, 50);
    Rectangle rectangle2 = new Rectangle(5, 50);

    // Assign the color yellow to both objects
    Rectangle.setColor("yellow");

    // Display the properties of both objects and their areas
    System.out.println("Rectangle 1:");
    System.out.println(rectangle1);
    System.out.println("Area: " + rectangle1.findArea());

    System.out.println("\nRectangle 2:");
    System.out.println(rectangle2);
    System.out.println("Area: " + rectangle2.findArea());
  }
}
