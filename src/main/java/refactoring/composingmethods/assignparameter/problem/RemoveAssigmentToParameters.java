package refactoring.composingmethods.assignparameter.problem;

public class RemoveAssigmentToParameters {
   
   private int yearToDate;

   int discount(int inputVal, int quantity) {
      if (inputVal > 50) 
        inputVal -= 2;
      if (quantity > 100)
         inputVal -= 1;
      if (yearToDate > 10000)
         inputVal -= 4;
      return inputVal;
    }
}