package refactoring.simplifyingmethodcalls.replaceparameterwithcall.problem;

public class Order {

   private int quantity;
   private int itemPrice;

   public void getPrice() {
      int basePrice = quantity * itemPrice;
      double seasonDiscount = this.getSeasonalDiscount();
      double fees = this.getFees();
      double finalPrice = discountedPrice(basePrice, seasonDiscount, fees);
      System.out.println(finalPrice);
   }

   private double discountedPrice(int basePrice, double seasonDiscount, double fees) {
      return basePrice * 100 - seasonDiscount + fees;
   }

   private double getFees() {
      return 50;
   }

   private double getSeasonalDiscount() {
      return 10;
   }
}