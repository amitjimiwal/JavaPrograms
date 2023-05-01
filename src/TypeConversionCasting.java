import java.util.Scanner;
public class TypeConversionCasting {
      public static void main(String[] args) {
            // Type conversion means converting one type to another 
            // it can be done both automatically(implicitly) and manually by the programmer(explicit) type conversion.
            Scanner input=new Scanner(System.in);
            float f=input.nextFloat();
            System.out.println(f);
            // convert the float to integer automatically
            // to convert int from float you need to do it explictly.
            int a=(int)(f);
            // narrowing
            System.out.println(a);

            // byte b=257;
            // // byte can store max value of 256
            // int num=b;
            // System.out.println(b);

      }
}
