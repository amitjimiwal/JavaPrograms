import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Loops - for , while ,do while.
        Scanner input=new Scanner(System.in);

        //FOR LOOPS
        /*
        for loop syntax;
            for(initialisation; condition; increment/decrement;){
              //statements
            }
        */
        //Q: WAP to print first 5 numbers.
//        for(int i=1;i<=5;i++){
//            System.out.println(i);
//        }



        //Q: WAP to print numbers from 1 to n.
//        int n= input.nextInt();
//
//        for (int i=1;i<=n;i++){
//            System.out.print(i+" ");
//        }



        //WHILE LOOPS

        /*
        Syntax For While Loop
        while(condition){
           statements
        }
         */

//        //Q: WAP to print first 5 numbers.(using while loop)
//        int num=1;
//        while (num<=5){
//            System.out.println(num);
//            num+=1;
//        }

        //Q: WAP to print numbers from 1 to n.(While Loop)
//        int end=input.nextInt();
//        int i=1;
//        while (i<=end){
//            System.out.println(i);
//            i++;
//        }



        //DO WHILE LOOP
        /*
          do{

          } while(condition);
         */

        int num=1;
        do{
            System.out.println("Hello WORLD");
            num +=1;
        } while (num<10);



    }
}
