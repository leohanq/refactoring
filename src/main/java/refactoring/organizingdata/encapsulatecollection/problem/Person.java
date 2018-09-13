package refactoring.organizingdata.encapsulatecollection.problem;

import java.util.List;

public class Person {

   private List<Course> _courses;

   public List<Course> getCourses() {
      return _courses;
   }

   public void setCourses(List<Course> arg) {
      _courses = arg;
   }
}