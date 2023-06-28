package Exception;

import java.util.Scanner;

// creates a custom Exception that is a checked Exception
class NotEligibleToVote extends Exception{
      NotEligibleToVote(){
            super("You are not eligible to vote");
      }
}
public class CustomExceptionVoting {
      public static void main(String[] args) {
            Scanner s =new Scanner(System.in);
            System.out.println("Welcome to voting system");
            System.out.println("Enter your Age");
            int age= s.nextInt();
            try {
                  if(age<18) throw new NotEligibleToVote();
            else System.out.println("Tou can vote bitch");
            } catch (NotEligibleToVote e) {
                  // TODO: handle exception
                  System.out.println(e.getMessage());
            }
      }
}
