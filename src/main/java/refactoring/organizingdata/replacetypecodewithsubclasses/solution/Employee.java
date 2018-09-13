package refactoring.organizingdata.replacetypecodewithsubclasses.solution;

public class Employee {

   private int _type;

   static final int ENGINEER = 0;
   static final int SALESMAN = 1;
   static final int MANAGER = 2;

   static Employee create(int type) {
      if (type == ENGINEER) {
         return new Engineer();
      }
      if (type == SALESMAN) {
         return new Salesman();
      }
      if (type == MANAGER) {
         return new Manager();
      }
      throw new IllegalArgumentException("Incorrect type code value");
   }

   public int get_type() {
      return _type;
   }

   public void set_type(int _type) {
      this._type = _type;
   }
}