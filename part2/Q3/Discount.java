public class Discount {
 public static double getServiceDiscountRate(String membership) {
  switch (membership.toLowerCase()) {
   case "premium":
    return 0.20;
   case "gold":
    return 0.15;
   case "silver":
    return 0.10;
   default:
    return 0.0; // No discount for non-members
  }
 }

 public static double getProductDiscountRate() {
  return 0.10;
 }
}
