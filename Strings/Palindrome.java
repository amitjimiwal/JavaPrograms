package Strings;

import java.util.Arrays;

public class Palindrome {
     public static void main(String[] args) {
          String s="ababc";
          String test="ab";
          System.out.println(isPalindrome(test));
          System.out.println(s.contains(test.repeat(3)));
          char[] arr=s.toCharArray();
          System.out.println(Arrays.toString(arr));
     }
     static boolean isPalindrome(String str){
          // using StringBuilders
          // StringBuilder reversestr=new StringBuilder();
          // int n=str.length()-1;
          // while (n>=0) {
          //      reversestr.append(str.charAt(n));
          //      n--;
          // }
          // System.out.println(reversestr);
          // return reversestr.toString().equals(str);
          
          //using two pointer approach
          int s=0;
          int e=str.length()-1;
          while(s<=e){
               if(str.charAt(s)!=str.charAt(e)){
                    return false;
               }
               s++;
               e--;
          }
          return true;
     }
}
