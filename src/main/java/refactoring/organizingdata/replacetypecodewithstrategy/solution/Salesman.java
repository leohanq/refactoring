package refactoring.organizingdata.replacetypecodewithstrategy.solution;

public class Salesman extends EmployeeType {

   @Override
   int getTypeCode() {
      return SALESMAN;
   }
}