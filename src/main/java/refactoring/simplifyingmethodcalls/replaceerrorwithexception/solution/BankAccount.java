package refactoring.simplifyingmethodcalls.replaceerrorwithexception.solution;

public class BankAccount {

   private int _balance;

   public void withdraw(int amount) throws BalanceException {
      int balance = 0;
      if (amount > _balance) {
         throw new BalanceException("Error Message");
      }
      balance -= amount;
   }
}