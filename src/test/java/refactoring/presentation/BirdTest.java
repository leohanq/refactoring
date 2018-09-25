package refactoring.presentation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BirdTest {

   private Bird bird;

   @Test
   public void testing_Eropean_Bird() {
      Bird european = new Bird(0, 2, 0);
      int speed = european.getSpeed();
      assertEquals(10, speed);
      System.out.println(speed);
   }
   
   @Test
   public void testing_African_Bird() {
      Bird african = new Bird(1, 0, 2);
      int speed = african.getSpeed();
      System.out.println(speed);
      assertEquals(6, speed);
   }
   
   @Test
   public void testing_Noruegan_Bird_with_Voltage_more_than_two() {
      Bird noruegan = new Bird(2, 3, 2);
      int speed = noruegan.getSpeed();
      System.out.println(speed);
      assertEquals(0, speed);
   }
}