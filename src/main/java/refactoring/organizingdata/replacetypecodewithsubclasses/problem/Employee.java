package refactoring.organizingdata.replacetypecodewithsubclasses.problem;

public class Employee {

   private int _type;
   static final int ENGINEER = 0;
   static final int SALESMAN = 1;
   static final int MANAGER = 2;

   Employee(int type) {
      set_type(type);
   }

   public int get_type() {
      return _type;
   }

   public void set_type(int _type) {
      this._type = _type;
   }
}