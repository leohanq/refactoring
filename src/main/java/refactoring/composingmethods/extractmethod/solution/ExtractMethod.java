package refactoring.composingmethods.extractmethod.solution;

public class ExtractMethod {

   void printOwing(String name,String amount) {
      printBanner();
      printDetails(name, amount);
    }

   private void printDetails(String name, String amount) {
      System.out.println("name: " + name);
      System.out.println("amount: " + amount);
   }

   private void printBanner() {
      System.out.println("Banner print");
   }
}
