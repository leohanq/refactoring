package refactoring.organizingdata.encapsulatecollection.solution;

public class Test {

   public static void main(String[] args) {
      Person kent = new Person();
      kent.addCourse(new Course("Smalltalk Programming", false));
      kent.addCourse(new Course("Appreciating Single Malts", true));
      kent.addCourse(new Course("Brutal Sarcasm", false));

      for (Course course : kent.getCourses()) {
         System.out.println("Course " + course.getName() + " Advance :" + course.isAdvanced());
      }
   }
}
