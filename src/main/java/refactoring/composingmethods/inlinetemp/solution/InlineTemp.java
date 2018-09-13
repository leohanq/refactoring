package refactoring.composingmethods.inlinetemp.solution;

import refactoring.utils.Order;

public class InlineTemp {

   public boolean hasDiscount(Order order) {
      return order.basePrice() > 1000;
    }
}