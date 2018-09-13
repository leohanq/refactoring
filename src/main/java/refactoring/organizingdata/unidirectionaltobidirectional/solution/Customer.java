package refactoring.organizingdata.unidirectionaltobidirectional.solution;

import java.util.List;

class Customer {

   private List<Order> _orders;
   
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

   void addOrder(Order order) {
      order.addCustomer(this);
   }

   void removeOrder(Order order) {
      order.removeCustomer(this);
   }

   List<Order> friendOrders() {
      /** should only be used by Order when modifying the association */
      return _orders;
   }
}