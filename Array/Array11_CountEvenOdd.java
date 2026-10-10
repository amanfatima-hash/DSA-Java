import java.util.Scanner;

public class Array11_CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of size.");
        int size = sc.nextInt();
        System.out.println("Enter Numbers:");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println("Even Numbers= " + evencount);
        System.out.println("Odd Numbers= " + oddcount);
        sc.close();
    }
}