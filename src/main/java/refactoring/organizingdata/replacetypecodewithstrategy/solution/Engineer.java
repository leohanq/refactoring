package refactoring.organizingdata.replacetypecodewithstrategy.solution;

public class Engineer extends EmployeeType {

   @Override
   int getTypeCode() {
      return ENGINEER;
   }
}