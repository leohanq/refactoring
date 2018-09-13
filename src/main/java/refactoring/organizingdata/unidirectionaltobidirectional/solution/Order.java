package refactoring.organizingdata.unidirectionaltobidirectional.solution;

import java.util.List;

public class Order {

   private Customer _customer;
   private List<Customer> _customers;

   Customer getCustomer() {
      return _customer;
   }

   void setCustomer(Customer arg) {
      if (_customer != null)
         _customer.friendOrders().remove(this);
      _customer = arg;
      if (_customer != null)
         _customer.friendOrders().add(this);
   }

   void addCustomer(Customer arg) {
      arg.friendOrders().add(this);
      _customers.add(arg);
   }

   void removeCustomer(Customer arg) {
      arg.friendOrders().remove(this);
      _customers.remove(arg);
   }
}