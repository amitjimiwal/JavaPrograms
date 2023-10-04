package Strings;

public class Performancer {
     public static void main(String[] args) {
          String series="";
          for (int index = 0; index < 26; index++) {
               char ch=(char)('a'+index);
               series+=ch;
          }
          System.out.println(series);
     }
}
