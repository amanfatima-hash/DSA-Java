import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList08_AddRemoveAtIndex {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Scanner sc = new Scanner(System.in);
        System.out.println("Original List : " + numbers);

        // Insert an element
        System.out.println("Enter index where do you want to insert: ");
        int insertIndex = sc.nextInt();
        System.out.println("Enter value to insert : ");
        int value = sc.nextInt();
        numbers.add(insertIndex, value);
        System.out.println("After Insertion : " + numbers);

        // Remove an element
        System.out.println("Enter index do you want to remove : ");
        int removeIndex = sc.nextInt();
        numbers.remove(removeIndex);
        System.out.println("After Removal : " + numbers);
        sc.close();
    }
}
