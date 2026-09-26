import java.util.*;

public class Array13_CountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 1, 2, 4, 6, 7, 4, 5, 5, 4 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Enter Element:");
        int search = sc.nextInt();
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (search == numbers[i]) {
                count++;
            }
        }
        System.out.println("Occurence of " + search + " is " + count);

        sc.close();
    }
}
