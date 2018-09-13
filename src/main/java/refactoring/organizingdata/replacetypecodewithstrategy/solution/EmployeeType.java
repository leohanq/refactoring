package refactoring.organizingdata.replacetypecodewithstrategy.solution;

public abstract class EmployeeType {

   static final int ENGINEER = 0;
   static final int SALESMAN = 1;
   static final int MANAGER = 2;

   abstract int getTypeCode();

   static EmployeeType newType(int arg) {
      switch (arg) {
      case ENGINEER:
         return new Engineer();
      case SALESMAN:
         return new Salesman();
      case MANAGER:
         return new Manager();
      default:
         throw new IllegalArgumentException("Incorrect Employee Code");
      }
   }
}