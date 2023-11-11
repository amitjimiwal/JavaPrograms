package Strings;
//StringBuilder makes the String mutable so if any chnage we do it wil not create a new object for it , it will update the string a the same locaton only.
public class MutableString {
     public static void main(String[] args) {
          StringBuilder sb=new StringBuilder();
          //same series
          for (int i = 0; i < 26; i++) {
               char c=(char)('a'+i);
               sb.append(c);
          }
          System.out.println(sb.toString());

          StringBuilder a=new StringBuilder("start");
          a.append("le");
          a.insert(2,"le");
          System.out.println(a); //stleartle
     }
}
