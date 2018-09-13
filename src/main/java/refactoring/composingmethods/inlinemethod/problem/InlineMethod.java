package refactoring.composingmethods.inlinemethod.problem;

public class InlineMethod {

   private int numberOfLateDeliveries;

   public int getRating() {
      return moreThanFiveLateDeliveries() ? 2 : 1;
   }

   private boolean moreThanFiveLateDeliveries() {
      return numberOfLateDeliveries > 5;
   }
}