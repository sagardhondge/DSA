import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number");
        int myInteger = input.nextInt();
        System.out.println("You entered: " + myInteger);

        if(false){
            System.out.println("hello ");
        }
        else System.out.println("nothig");
    }
}