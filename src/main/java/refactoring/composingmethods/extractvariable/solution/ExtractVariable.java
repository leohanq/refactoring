package refactoring.composingmethods.extractvariable.solution;

public class ExtractVariable {

   void renderBanner(int resize, String browser, String platform) {
      if (isMacOs(platform) && isIE(browser) && wasResized(resize) && wasInitialized()) {
         // do something
      }
   }

   private boolean wasResized(int resize) {
      return resize > 0;
   }

   private boolean isIE(String browser) {
      return browser.toUpperCase().indexOf("IE") > -1;
   }

   private boolean isMacOs(String platform) {
      return platform.toUpperCase().indexOf("MAC") > -1;
   }

   private boolean wasInitialized() {
      // some logic
      return true;
   }
}