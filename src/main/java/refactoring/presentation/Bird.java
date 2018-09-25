package refactoring.presentation;

public class Bird {

   // public static final int EUROPEAN = 0;
   // public static final int AFRICAN = 1;
   // public static final int NORUEGAN_BLUE = 2;

   private int type;
   private int speed;
   private int voltage;
   private int coconouts;

   public Bird(int birdType, int voltage, int coconouts) {
      this.type = birdType;
      this.voltage = voltage;
      this.coconouts = coconouts;
   }

   public int getSpeed() {
      switch (type) {
      case 0: // European Bird
         return 10;// Base speed
      case 1: // African Bird
         return 10 - 2 * coconouts;// Base speed - factorLoad * number of coconouts
      case 2: // Noruegan Bird
         return isNailed() ? 0 : 10 * voltage;// nailed = 0 or base speed * voltage
      }
      return 0;
   }

   private boolean isNailed() {
      return moreThanTwo();
   }

   private boolean moreThanTwo() {
      boolean isTrue = voltage > 2;
      return isTrue;
   }
}