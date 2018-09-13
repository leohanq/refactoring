package refactoring.organizingdata.unidirectionaltobidirectional.problem;

class Customer  {    
   
   private String _name;

   public Customer(String name) {
      this.setName(name);
   }

   public String getName() {
      return _name;
   }

   public void setName(String name) {
      this._name = name;
   }
}