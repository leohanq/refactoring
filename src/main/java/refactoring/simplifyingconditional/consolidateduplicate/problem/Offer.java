package refactoring.simplifyingconditional.consolidateduplicate.problem;

public class Offer {

   private double total;

   public void buy(double price) {

      if (isSpecialDeal()) {
         total = price * 0.95;
         send();
      } else {
         total = price * 0.98;
         send();
      }
   }

   private void send() {
      System.out.println("Sending....");
   }

   private boolean isSpecialDeal() {
      return false;
   }
}