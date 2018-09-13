package refactoring.composingmethods.temporalwithquery.problem;

public class TemporalQuery {

   private int quantity;
   private int itemPrice;

   public double calculateTotal() {
      double basePrice = quantity * itemPrice;
      if (basePrice > 1000) {
        return basePrice * 0.95;
      }
      else {
        return basePrice * 0.98;
      }
    }
}