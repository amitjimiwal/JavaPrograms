package Arrays;

import java.util.Arrays;

public class ArrayTraversal {
     public static void main(String[] args) {
          String[] str=new String[4];
          str[0]="Amit";
          str[1]="Ok";
          str[2]="Cfhd";
          str[3]="Dd";
          // print the array- Arrays.toString(arrayanme) method
          System.out.println(Arrays.toString(str)); //  [Amit, Ok, Cfhd, Dd]

          //or by using the for loop
          for(int i=0;i<str.length;i++){
               System.out.println(str[i]);
          }

          // or by using the enhanced for loop
          for(String s:str){
               System.out.println(s);
          }
          
     }
}
