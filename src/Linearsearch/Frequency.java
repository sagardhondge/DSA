import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to count: ");
        int key = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency of " + key + " is: " + count);

        sc.close();
    }
}
