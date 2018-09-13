package refactoring.simplifyingconditional.conditionalwithguardclauses.solution;

public class Payment {

   private boolean isDead;
   private boolean isSeparated;
   private boolean isRetired;

   public double getPayAmount() {
      if (isDead) {
         return deadAmount();
      }
      if (isSeparated) {
         return separatedAmount();
      }
      if (isRetired) {
         return retiredAmount();
      }
      return normalPayAmount();
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
