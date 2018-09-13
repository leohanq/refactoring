package refactoring.simplifyingmethodcalls.preserveholeobject.problem;

public class Order {

   private Range daysTempRange;
   private Plan plan;

   public boolean retrievePlan() {
      int low = daysTempRange.getLow();
      int high = daysTempRange.getHigh();
      boolean withinPlan = plan.withinRange(low, high);
      return withinPlan;
   }
}