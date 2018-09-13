package refactoring.simplifyingconditional.consolidateconditional.problem;

public class Amount {
   
   private int seniority;
   private int monthsDisabled;
   private boolean isPartTime;

   public double disabilityAmount() {
      if (seniority < 2) {
        return 0;
      }
      if (monthsDisabled > 12) {
        return 0;
      }
      if (isPartTime) {
        return 0;
      }
      // compute the disability amount
      //...
      return 1;
    }
}