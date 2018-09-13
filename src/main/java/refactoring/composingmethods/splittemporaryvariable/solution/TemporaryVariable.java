package refactoring.composingmethods.splittemporaryvariable.solution;

public class TemporaryVariable {

   private int height;
   private int width;

   public double calculate() {
      final double perimeter = 2 * (height + width);
      System.out.println(perimeter);
      final double area = height * width;
      System.out.println(area);
      return area;
   }
}