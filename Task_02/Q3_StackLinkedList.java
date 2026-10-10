package Task_02;
import java.util.Scanner;
public class Q3_StackLinkedList {
    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;
    int size = 0;

    // Push: insert element at top
    void push(int value) {
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;
        size++;

        System.out.println(value + " pushed onto the stack.");
    }

    // Pop: remove top element
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return;
        }

        System.out.println("Popped element: " + top.data);
        top = top.next;
        size--;
    }

    // Peek: show top element
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // Display all elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;

        System.out.println("Stack elements (Top to Bottom):");

        while (current != null) {
            System.out.println("| " + current.data + " |");
            current = current.next;
        }

        System.out.println("-----");
    }

    // Check whether stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Return stack size
    int getSize() {
        return size;
    }

    // Search for an element
    void search(int value) {
        Node current = top;
        int position = 1;

        while (current != null) {
            if (current.data == value) {
                System.out.println(
                    value + " found at position " + position +
                    " from the top."
                );
                return;
            }

            current = current.next;
            position++;
        }

        System.out.println(value + " not found in the stack.");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Q3_StackLinkedList stack = new Q3_StackLinkedList();

        int choice;

        do {
            System.out.println("\n===== STACK USING LINKED LIST =====");
            System.out.println("1. Push (Insert)");
            System.out.println("2. Pop (Delete)");
            System.out.println("3. Peek (Top Element)");
            System.out.println("4. Display Stack");
            System.out.println("5. Check if Empty");
            System.out.println("6. Show Stack Size");
            System.out.println("7. Search Element");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    int value = input.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;

                case 6:
                    System.out.println(
                        "Current stack size: " + stack.getSize()
                    );
                    break;

                case 7:
                    System.out.print("Enter value to search: ");
                    int searchValue = input.nextInt();
                    stack.search(searchValue);
                    break;

                case 8:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 8);

        input.close();
    }
}
