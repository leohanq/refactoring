package refactoring.organizingdata.encapsulatecollection.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

   private List<Course> _courses = new ArrayList<>();

   public void addCourse(Course course) {
      _courses.add(course);
   }

   public void removeCourse(Course course) {
      _courses.remove(course);
   }

   public void initializeCourses(List<Course> courses) {
      if (courses.isEmpty()) {
         _courses.addAll(courses);
      }
   }
   
   public List<Course> getCourses() {
      return Collections.unmodifiableList(_courses);
   }
}