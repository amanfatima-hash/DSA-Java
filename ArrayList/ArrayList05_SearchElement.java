import java.util.ArrayList;
import java.util.Scanner;;

public class ArrayList05_SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Fatima");
        names.add("John");
        names.add("Ayesha");
        names.add("Khansah");
        System.out.println("Names: " + names);
        System.out.println("Enter a name to search:");
        String name = sc.nextLine();
        if (names.contains(name)) {
            int index = names.indexOf(name);
            System.out.println("Name Found.");
            System.out.println("Index: "+index);
        } else {
            System.out.println("Name not found.");
        }
        sc.close();
    }
}
