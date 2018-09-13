package refactoring.movingfeaturesbetweenobjects.introduceforeignmethod.solution;

import java.util.Date;

public class Report {

   Date previousEnd = null;

   @SuppressWarnings("deprecation")
   public void sendReport() {

      Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
      Date newStart2 = nextDay(previousEnd);
   }

   private static Date nextDay(Date arg) {   
      // foreign method, should be on date       
      return new Date (arg.getYear(),arg.getMonth(), arg.getDate() + 1);   
   }
}