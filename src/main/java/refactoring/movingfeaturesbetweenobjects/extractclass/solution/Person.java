package refactoring.movingfeaturesbetweenobjects.extractclass.solution;

public class Person {

   private String _name;
   private TelephoneNumber _officeTelephone = new TelephoneNumber();

   public String getName() {
      return _name;
   }

   String getTelephoneNumber() {
      return _officeTelephone.getTelephoneNumber();
   }
   
   public TelephoneNumber get_officeTelephone() {
      return _officeTelephone;
   }
}