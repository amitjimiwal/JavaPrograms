package Recursion;
/*
  Structure of a Recursive function
  function(){
     base-condition: the condition ar which the recursive function will not call itself and return (just like m3())
     body - that is common to all the recursive call
     recursive call
     function();
  }
 */
public class HelloWorldRecursion {
     public static void main(String[] args) {
         message(3); 
     }
     //recursive function
     static void message(int n){
       if(n==0){ //base condition
          return;
       }
       //common body
       System.out.println("Hello world");
       //recursive call
       message(n-1);
     }
}
