package refactoring.simplifyingmethodcalls.replaceconstructorwithfactorymethod.solution;

public class Employee {

   private static Employee employee;
   private int type;

   public Employee(int type) {
      this.type = type;
   }

   static Employee create(int type) {
      employee = new Employee(type);
      // do some heavy lifting.
      return employee;
    }
    //...
   public int getType() {
      return type;
   }

   public void setType(int type) {
      this.type = type;
   }
}