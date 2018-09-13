package refactoring.organizingdata.encapsulatecollection.solution;

public class Course {

   private String name;
   private boolean isAdvance;

   public Course(String name, boolean isAdvance) {
      this.name = name;
      this.isAdvance = isAdvance;
   }

   public boolean isAdvanced() {
      return isAdvance;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}