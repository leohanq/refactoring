package refactoring.simplifyingconditional.replaceconditionalwithpolymorphism.solution;

public class TestCode {

   public static void main(String[] args) {
      retrieveFlyBird();
   }

   private static void retrieveFlyBird() {
      Bird europeanBird = new European();
      Bird africanBird = new African();
      Bird norwegianBird = new NorwegianBlue();

      double europeanSpeed = europeanBird.getSpeed();
      double africanSpeed = africanBird.getSpeed();
      double norwegianSpeed = norwegianBird.getSpeed();

      System.out.println("African Speed " + africanSpeed + "Km/h");
      System.out.println("European Speed " + europeanSpeed + "Km/h");
      System.out.println("NorwegianBird Speed " + norwegianSpeed + "Km/h");
   }
}