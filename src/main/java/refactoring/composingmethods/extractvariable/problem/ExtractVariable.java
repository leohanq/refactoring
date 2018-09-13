package refactoring.composingmethods.extractvariable.problem;

public class ExtractVariable {

   void renderBanner() {
      int resize = 1;
      String platform = "MAC";
      String browser = "IE";
      if ((platform.toUpperCase().indexOf("MAC") > -1) && (browser.toUpperCase().indexOf("IE") > -1) && wasInitialized()
            && resize > 0) {
         // do something
      }
   }

   private boolean wasInitialized() {
      // some logic
      return true;
   }
}