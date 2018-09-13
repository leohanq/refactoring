package refactoring.simplifyingconditional.conditionalwithguardclauses.problem;

public class Payment {

   private boolean isDead;
   private boolean isSeparated;
   private boolean isRetired;

   public double getPayAmount() {
      double result;
      if (isDead) {
         result = deadAmount();
      } else {
         if (isSeparated) {
            result = separatedAmount();
         } else {
            if (isRetired) {
               result = retiredAmount();
            } else {
               result = normalPayAmount();
            }
         }
      }
      return result;
   }

   private double normalPayAmount() {
      return 1;
   }

   private double retiredAmount() {
      return 2;
   }

   private double separatedAmount() {
      return 3;
   }

   private double deadAmount() {
      return 4;
   }
}
