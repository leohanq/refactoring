package refactoring.composingmethods.assignparameter.solution;

public class RemoveAssigmentToParameters {

   int discount(final int inputVal, final int quantity, final int yearToDate) {
      int discount = inputVal;
      if (inputVal > 50)
         discount -= 2;
      if (quantity > 100)
         discount -= 1;
      if (yearToDate > 10000)
         discount -= 4;
      return discount;
   }
}