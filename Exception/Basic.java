package Exception;

class Basic{
      public static void main(String[] args) {
            System.out.println("S1");
            try{
               System.out.println(0/0); 
            }catch(ArithmeticException obj){
                System.out.println(obj);
            }
          
            System.out.println("S2");
            // without try catch
            // OP
            // S1 
            // Exception in thread "main" java.lang.ArithmeticException: / by zero
            // abnormal termination
            System.out.println("example of unchecked exception");
      }
}