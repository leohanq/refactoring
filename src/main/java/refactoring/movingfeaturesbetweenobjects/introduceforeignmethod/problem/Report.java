package refactoring.movingfeaturesbetweenobjects.introduceforeignmethod.problem;

import java.util.Date;

public class Report {

   Date previousEnd = null;

   @SuppressWarnings("deprecation")
   public void sendReport() {

      Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
   }
   
   

}
