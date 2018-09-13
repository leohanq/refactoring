package refactoring.simplifyingconditional.decomposeconditional.solution;

import java.util.Date;

public class ChargeService {

   private static final Date SUMMER_START = null;
   private static final Date SUMMER_END = null;

   public void charge() {
      Date date = new Date();
      int charge = 1;
      int quantity = 12;
      
      if (notSummer(date)) {
         charge = winterCharge(quantity);
      } else {
         charge = summerCharge(quantity);
      }
      System.out.println(charge);
   }

   private boolean notSummer(Date date) {
      return date.before(SUMMER_START) || date.after(SUMMER_END);
   }

   private int summerCharge(int quantity) {
      int summerRate = 1500;
      return quantity * summerRate;
   }

   private int winterCharge(int quantity) {
      int winterRate = 1200;
      int winterServiceCharge = 1230;
      return quantity * winterRate + winterServiceCharge;
   }
}