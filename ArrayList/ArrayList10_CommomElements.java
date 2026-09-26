import java.util.ArrayList;

public class ArrayList10_CommomElements {
    public static void main(String[] args) {
        // Create first list
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        // Create Second List
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);

        // Make a copy of list 1
        ArrayList<Integer> commmon = new ArrayList<>(list1);

        // Keep only element that are also in list 2
        commmon.retainAll(list2);

        // Display
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Common Element : " + commmon);
    }
}
