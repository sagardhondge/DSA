
import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Deperament = in.next();
        switch(empID){
            case 1:
                System.out.println("Sagar Dhondge");
                break;
            case 2:
                System.out.println("vedant Jagtap" );
                break;
            case 3:
                switch (Deperament){
                    case "it":
                        System.out.println("It Deperament");
                        break;
                    case "CS":
                        System.out.println("CS Deperament");
                    default:
                        System.out.println("no Deperamnet");
                }
            default:
                System.out.println("Enter correct data");
        }
    }
}
