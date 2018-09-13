package refactoring.composingmethods.inlinetemp.problem;

import refactoring.utils.Order;

public class InlineTemp {

   public boolean hasDiscount(Order order) {
      double basePrice = order.basePrice();
      return basePrice > 1000;
    }
}
