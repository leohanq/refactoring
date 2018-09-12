package refactoring;

public class ExtractMethod {

   void printOwing(String name,String amount) {
      printBanner();

      //print details
      System.out.println("name: " + name);
      System.out.println("amount: " + amount);
    }

   private void printBanner() {
      System.out.println("Banner print");
   }
}
