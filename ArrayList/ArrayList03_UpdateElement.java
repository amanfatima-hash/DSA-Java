import java.util.ArrayList;

public class ArrayList03_UpdateElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(60);
        numbers.add(75);

        System.out.println(numbers);
        // Update Element
        numbers.set(1, 85);
        numbers.set(3, 65);

        // Update List
        System.out.println("Update List:");
        System.out.println(numbers);

    }
}
