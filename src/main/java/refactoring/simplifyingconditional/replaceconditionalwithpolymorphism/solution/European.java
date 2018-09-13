package refactoring.simplifyingconditional.replaceconditionalwithpolymorphism.solution;

public class European extends Bird {

   @Override
   double getSpeed() {
      return getBaseSpeed();
    }

   private double getBaseSpeed() {
      return 200;
   }
}