import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit="mango";
        switch (fruit){
            case "mango":
                System.out.println("KingOFFruits");
                break;
            case "Apple":
                System.out.println("A Sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            case "grapes":
                System.out.println("Small Fruit");
            default:
                System.out.println("Please enter a valid fruit");

        }
    }
}
