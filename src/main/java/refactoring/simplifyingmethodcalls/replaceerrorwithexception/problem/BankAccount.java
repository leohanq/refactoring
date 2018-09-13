package refactoring.simplifyingmethodcalls.replaceerrorwithexception.problem;

public class BankAccount {
   
   private int _balance;

   public int withdraw(int amount) {
      int balance = 0;
      if (amount > _balance) {
         return -1;
       }
       else {
         balance -= amount;
         return 0;
       }
     }
}