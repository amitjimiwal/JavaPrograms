/*
varArgs means variable length arguments means when we dont knoww how many variables we want
to pass into the function so we declare a variable argument
which stores all the things in a array.

Syntax:
      function_name( datatype ...<variable_name>)
      ex:
       func(int ...ar) //array of integers
       func(String ...str) //array of Strings.
 */


import java.util.Arrays;

public class VarArgs { //Variable length arguments
    public static void main(String[] args) {
        fun(1,2,3,3,4,3,22,2);
        multiplevarargs(1,2,"amit","jimiwal","abhinav");
    }
    static void fun(int ...v){ //an integer array named v
        // ... represents variable arguments or length of the array is not fixed

        System.out.println(Arrays.toString(v));

    }
    static void multiplevarargs(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
        //varargs should be the last argument in a function call because its length not fixed
    }
}
