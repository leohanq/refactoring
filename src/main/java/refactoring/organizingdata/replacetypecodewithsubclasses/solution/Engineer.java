package refactoring.organizingdata.replacetypecodewithsubclasses.solution;

public class Engineer extends Employee {
   
   int getType() {
      return Employee.ENGINEER;
   }
}
