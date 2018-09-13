package refactoring.simplifyingconditional.consolidateconditional.solution;

public class Amount {

   private int seniority;
   private int monthsDisabled;
   private boolean isPartTime;

   public double disabilityAmount() {
      if (isNotEligableForDisability())
         return 0;
      // compute the disability amount
      // ...
      return 1;
   }

   private boolean isNotEligableForDisability() {
      if (seniority < 2 || monthsDisabled > 12 || isPartTime) {
         return true;
      }
      return false;
   }
}