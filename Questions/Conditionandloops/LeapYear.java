import java.util.Scanner;



//WAP to check for leap year.
public class LeapYear {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);  //using scanner class to input an object by making an bobject "in" to take input
        int year;  //declaring a variable int
        year=in.nextInt();
        if (year%4==0 && year%100!=0){  //leap year condition
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("IT is not a leap year");
        }
    }
}
