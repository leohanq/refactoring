package refactoring.simplifyingconditional.replaceconditionalwithpolymorphism.solution;

public class African extends Bird {

   private int numberOfCoconuts = 1; 

   @Override
   double getSpeed() {
      return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
   }

   private int getLoadFactor() {
      return 2;
   }

   private int getBaseSpeed() {
      return 200;
   }
}