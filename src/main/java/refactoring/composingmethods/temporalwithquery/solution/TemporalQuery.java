package refactoring.composingmethods.temporalwithquery.solution;

public class TemporalQuery {

   private int quantity;
   private int itemPrice;

   public double calculateTotal() {
      if (basePrice() > 1000) {
        return basePrice() * 0.95;
      }
      else {
        return basePrice() * 0.98;
      }
    }

   private int basePrice() {
      return quantity * itemPrice;
   }
}