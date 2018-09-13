package refactoring.composingmethods.inlinemethod.solution;

public class InlineMethod {

   private int numberOfLateDeliveries;

   public int getRating() {
      return numberOfLateDeliveries > 5 ? 2 : 1;
   }
}