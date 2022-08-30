import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        /*
        Syntax of if-elsestatements:


        if(boolean expression T or F){
           //body
        } else{
          //body
        }
        */
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary= input.nextInt();

//        if (salary > 10000){
//            salary=salary+2000; //inc salary by 2000
//        } else {
//            salary=salary+1000; //increase salary by 1000
//        }


        //multiple if else
        if (salary<=10000){
            salary +=1000;
        } else if (salary <= 20000){
            salary +=2000;
        } else {
            salary +=3000;
        }
        System.out.println("New Salary is: "+ salary);
    }
}
