
import java.util.Scanner;

public class switchc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("an red fruit");
                break;
            case "orange":
                System.out.println("an sweet fruit");
                break;
            default:
                System.out.println("not an fruit");
        }

        // enhanced syntax
        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("an red fruit");
            case "orange" -> System.out.println("an sweet fruit");
            default -> System.out.println("not an fruit");
        }
    }
}
