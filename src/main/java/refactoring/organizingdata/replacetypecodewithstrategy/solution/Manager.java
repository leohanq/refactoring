package refactoring.organizingdata.replacetypecodewithstrategy.solution;

public class Manager extends EmployeeType {

   @Override
   int getTypeCode() {
      return MANAGER;
   }
}