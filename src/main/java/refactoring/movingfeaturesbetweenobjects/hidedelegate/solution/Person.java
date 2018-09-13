package refactoring.movingfeaturesbetweenobjects.hidedelegate.solution;

public class Person {

   Department _department;
   
   public Person getManager() {
      return _department.getManager();
   }

   public void setDepartment(Department arg) {
      _department = arg;
   }
}
