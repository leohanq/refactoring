package refactoring.organizingdata.replacetypecodewithstrategy.solution;

public class Employee {

   private EmployeeType _type;

   private int _monthlySalary;
   private int _commission;
   private int _bonus;

   Employee(int type) {
      setType(type);
   }

   int payAmount() {
      switch (getType()) {
      case EmployeeType.ENGINEER:
         return _monthlySalary;
      case EmployeeType.SALESMAN:
         return _monthlySalary + _commission;
      case EmployeeType.MANAGER:
         return _monthlySalary + _bonus;
      default:
         throw new RuntimeException("Incorrect Employee");
      }
   }

   public int getType() {
      return _type.getTypeCode();
   }

   void setType(int arg) {
      _type = EmployeeType.newType(arg);
   }
}