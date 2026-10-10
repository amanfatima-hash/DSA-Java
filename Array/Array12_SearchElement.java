import java.util.*;

public class Array12_SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of size.");
        int size = sc.nextInt();
        System.out.println("Enter Numbers:");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter Number for Searching:");
        int searchnumber = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == searchnumber) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
        sc.close();
    }

}
