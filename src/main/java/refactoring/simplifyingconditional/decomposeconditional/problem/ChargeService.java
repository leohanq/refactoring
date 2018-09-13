package refactoring.simplifyingconditional.decomposeconditional.problem;

import java.util.Date;

public class ChargeService {

   private static final Date SUMMER_START = null;
   private static final Date SUMMER_END = null;
   private Date date;

   public void charge() {
      int winterRate = 1200;
      int winterServiceCharge = 1230;
      int charge = 1;
      int quantity = 12;
      int summerRate = 1500;
      if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
         charge = quantity * winterRate + winterServiceCharge;
      } else {
         charge = quantity * summerRate;
      }
      System.out.println(charge);
   }
}
