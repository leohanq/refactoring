package refactoring.simplifyingmethodcalls.replaceerrorwithexception.solution;

public class BalanceException extends Exception {

   private static final long serialVersionUID = 1L;

   public BalanceException(String message) {
      super(message);
   }
}