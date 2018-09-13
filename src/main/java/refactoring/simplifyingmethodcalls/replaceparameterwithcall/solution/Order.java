package refactoring.simplifyingmethodcalls.replaceparameterwithcall.solution;

public class Order {

   private int quantity;
   private int itemPrice;

   public void getPrice() {
      int basePrice = quantity * itemPrice;
      double finalPrice = discountedPrice(basePrice);
      System.out.println(finalPrice);
   }

   private double discountedPrice(int basePrice) {
      return basePrice * 100 - this.getSeasonalDiscount() + this.getFees();
   }

   private double getFees() {
      return 50;
   }

   private double getSeasonalDiscount() {
      return 10;
   }
}