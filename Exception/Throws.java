package Exception;

import java.io.FileNotFoundException;
import java.nio.channels.FileLockInterruptionException;

class Throws {
      static void dummy() throws ArithmeticException {
            // Thread.sleep(0);
            System.out.println(0/1);
      }

      public static void main(String[] args) {
            int[] a = new int[] { 1, 2, 3, 4 };
            try {
                  dummy();
                  System.out.println("S1");
                  System.out.println("S3");
            } catch (ArithmeticException obj) {
                  System.out.println("S4");
                  System.out.println(obj.getMessage());
                  System.out.println(obj.toString());
            }

            System.out.println("S2");
            /*
             * S1
             * S3
             * S2
             * example of exception
             */
            System.out.println("example of  exception");
      }
}