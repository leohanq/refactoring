package refactoring.organizingdata.replacetypecodewithsubclasses.solution;

public class Salesman extends Employee{
   
   int getType(int type) {
      return Employee.SALESMAN;
   }
}