import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an year :");
        int year=in.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year. ");
        } else {
            System.out.println(year + " is not a leap year. ");
        }

        in.close();
    }

    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4
        // but not by 100, unless it is also divisible by 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

