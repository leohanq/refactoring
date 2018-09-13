package refactoring.composingmethods.splittemporaryvariable.problem;

public class TemporaryVariable {

   private int height;
   private int width;

   public double calculate() {
      double temp = 2 * (height + width);
      System.out.println(temp);
      temp = height * width;
      System.out.println(temp);
      return temp;
   }

}
