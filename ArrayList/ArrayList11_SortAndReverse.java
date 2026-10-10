import java.util.ArrayList;
import java.util.Collections;

public class ArrayList11_SortAndReverse {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original List: " + numbers);

        // Sorting
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // Reverse the list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);
    }
}
