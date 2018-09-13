package refactoring.composingmethods.replacemethodwithobject.solution;

public class Account {

   int gamma(int inputVal, int quantity, int yearToDate) {
      return new Gamma(this, inputVal, quantity, yearToDate).compute();
   }

   public int delta() {
      return 12 * 4;
   }
}