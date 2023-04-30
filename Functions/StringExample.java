//Here we will see how to return a string from function


import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        System.out.println("Hello "+name());

    }
    static String name(){
        Scanner in=new Scanner(System.in);
        String nm=in.nextLine();
        return nm;
    }
}
