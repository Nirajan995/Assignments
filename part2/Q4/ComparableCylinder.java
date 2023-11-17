public class ComparableCylinder extends Cylinder {
 public ComparableCylinder(double radius, double height) {
  super(radius, height);
 }

 @Override
 public int compareTo(GeometricObject o) {
  if (o instanceof ComparableCylinder) {
   ComparableCylinder other = (ComparableCylinder) o;
   return Double.compare(this.getVolume(), other.getVolume());
  }
  return 0;
 }
}
