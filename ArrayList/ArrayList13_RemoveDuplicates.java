import java.util.ArrayList;
public class ArrayList13_RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        numbers.add(50);
        ArrayList<Integer> unique = new ArrayList<>();

        // Check each element
        for (int number : numbers) {
            if (!unique.contains(number)) {
                unique.add(number);
            }
        }
        System.out.println("Original List: " + numbers);
        System.out.println("Unique List: " + unique);
    }
}
