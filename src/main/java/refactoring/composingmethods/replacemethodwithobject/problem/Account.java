package refactoring.composingmethods.replacemethodwithobject.problem;

public class Account {

   int gamma (int inputVal, int quantity, int yearToDate) {         
      int importantValue1 = (inputVal * quantity) + delta();         
      int importantValue2 = (inputVal * yearToDate) + 100;         
      if ((yearToDate - importantValue1) > 100)             
         importantValue2 -= 20;         
      int importantValue3 = importantValue2 * 7;         
      // and so on.         
      return importantValue3 - 2 * importantValue1;    
   }

   private int delta() {
      return 12 * 4;
   }
}
