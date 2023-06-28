package Exception;

import javax.naming.InsufficientResourcesException;

// creating a Custom checked Exception
class InsuffucientFunds extends Exception{
      InsuffucientFunds(){
            super("Insufficient funds in your account");
      }
}
// Creating a account class for a user to store its balance and name;
class Account{
      protected String name;
      protected long balance;
      Account(String name,long balance){
            this.name=name;
            this.balance=balance;
      }
      void withdraw(long amount) throws InsuffucientFunds{
            if (this.balance<amount) throw new InsuffucientFunds() ;
            else {
                  this.balance=this.balance-amount;
                  System.out.println("Withdrawal successful!");
            }

      }
}
public class InsuffucientFundsCustom {
      public static void main(String[] args) {
            Account person1=new Account("Amit",1000);
            try {
                  person1.withdraw(1200);
                  System.out.println(person1.balance);
            }
            catch(InsuffucientFunds e){
                  System.out.println(e.getMessage());
            }
      }
}
