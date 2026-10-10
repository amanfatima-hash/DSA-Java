import java.util.ArrayList;

public class ArrayList09_CopyAndCombine {
    public static void main(String[] args) {
        // Create first list
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        // Create Second List
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(60);

        // copy list 1
        ArrayList<Integer> combinedList = new ArrayList<>(list1);

        // Add list 2 to Copied list
        combinedList.addAll(list2);

        // Display Lists
        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);
        System.out.println("Combined list : " + combinedList);

    }
}
