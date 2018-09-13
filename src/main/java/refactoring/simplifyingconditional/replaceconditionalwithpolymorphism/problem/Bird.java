package refactoring.simplifyingconditional.replaceconditionalwithpolymorphism.problem;

public class Bird {

   private BirdType type;
   private int numberOfCoconuts;
   private boolean isNailed;
   private int voltage;

   //...
   public double getSpeed() {
     switch (type) {
       case EUROPEAN:
         return getBaseSpeed();
       case AFRICAN:
         return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
       case NORWEGIAN_BLUE:
         return (isNailed) ? 0 : getBaseSpeed(voltage);
     }
     throw new RuntimeException("Should be unreachable");
   }

   private double getBaseSpeed() {
      return 2;
   }

   private int getLoadFactor() {
      return 1;
   }

   private double getBaseSpeed(int voltage) {
      return 2 * voltage;
   }
 }