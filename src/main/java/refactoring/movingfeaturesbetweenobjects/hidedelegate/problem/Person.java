package refactoring.movingfeaturesbetweenobjects.hidedelegate.problem;

public class Person {

   Department _department;

   public Department getDepartment() {
      return _department;
   }

   public void setDepartment(Department arg) {
      _department = arg;
   }
}
