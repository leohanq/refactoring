package refactoring.simplifyingconditional.replaceconditionalwithpolymorphism.solution;

public class NorwegianBlue extends Bird {

   private boolean isNailed;
   private int voltage = 2;

   @Override
   double getSpeed() {
      return (isNailed) ? 0 : getBaseSpeed(voltage);
   }

   private int getBaseSpeed(int voltage) {
      return 2 * voltage;
   }
}