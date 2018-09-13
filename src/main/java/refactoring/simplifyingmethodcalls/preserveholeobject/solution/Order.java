package refactoring.simplifyingmethodcalls.preserveholeobject.solution;

public class Order {

   private Range daysTempRange;
   private Plan plan;

   public boolean retrievePlan() {
      boolean withinPlan = plan.withinRange(daysTempRange);
      return withinPlan;
   }
}