package refactoring.organizingdata.replacetypecodewithsubclasses.solution;

public class Manager extends Employee {

   int getType(int type) {
      return Employee.MANAGER;
   }
}