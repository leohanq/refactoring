package refactoring.organizingdata.encapsulatecollection.problem;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

public class Test {

   public static void main(String[] args) {
      Person kent = new Person();
      Set<Course> s = new HashSet<>();
      s.add(new Course("Smalltalk Programming", false));
      s.add(new Course("Appreciating Single Malts", true));
     // kent.setCourses(s);
      Assert.assertEquals(2, kent.getCourses().size());
      Course refact = new Course("Refactoring", true);
      kent.getCourses().add(refact);
      kent.getCourses().add(new Course("Brutal Sarcasm", false));
      Assert.assertEquals(4, kent.getCourses().size());
      kent.getCourses().remove(refact);
      Assert.assertEquals(3, kent.getCourses().size());

      Iterator iter = kent.getCourses().iterator();
      int count = 0;
      while (iter.hasNext()) {
         Course each = (Course) iter.next();
         if (each.isAdvanced())
            count++;
      }
      System.out.println(count);
   }
}