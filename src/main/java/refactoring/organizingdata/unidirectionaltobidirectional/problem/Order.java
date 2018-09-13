package refactoring.organizingdata.unidirectionaltobidirectional.problem;

public class Order {
   
   Customer _customer;

   Customer getCustomer() {
      return _customer;
   }

   void setCustomer(Customer customer) {
      _customer = customer;
   }
}