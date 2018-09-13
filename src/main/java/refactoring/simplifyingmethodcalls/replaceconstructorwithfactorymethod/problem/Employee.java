package refactoring.simplifyingmethodcalls.replaceconstructorwithfactorymethod.problem;

public class Employee {

   private int type;

   Employee(int type) {
      this.setType(type);
      // do some heavy lifting.
   }
   // ...

   public int getType() {
      return type;
   }

   public void setType(int type) {
      this.type = type;
   }
}