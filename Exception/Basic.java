package Exception;

import java.io.FileNotFoundException;
import java.nio.channels.FileLockInterruptionException;

class Basic{
      public static void main(String[] args) {
            
            try{
              
            System.out.println("S1");
            // System.out.println("S2");
             System.out.println(0/0); 
            System.out.println("S3");
            }catch(Exception obj){
                System.out.println("S4");
            }
          
            System.out.println("S2");
            // without try catch
            // OP
            // S1 
            // Exception in thread "main" java.lang.ArithmeticException: / by zero
            // abnormal termination
            System.out.println("example of  exception");
      }
}