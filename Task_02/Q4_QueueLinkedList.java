package Task_02;
import java.util.Scanner;

public class Q4_QueueLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node front = null;
    Node rear = null;
    int size = 0;

    // Insert element at rear
    void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println(value + " inserted into queue.");
    }

    // Remove element from front
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return;
        }

        System.out.println("Removed element: " + front.data);

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    // Show front element
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Display all elements
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;

        System.out.print("Queue (Front to Rear): ");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == null;
    }

    // Return queue size
    int getSize() {
        return size;
    }

    // Search for an element
    void search(int value) {
        Node current = front;
        int position = 1;

        while (current != null) {
            if (current.data == value) {
                System.out.println(
                    value + " found at position " + position
                    + " from the front."
                );
                return;
            }

            current = current.next;
            position++;
        }

        System.out.println(value + " not found in queue.");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Q4_QueueLinkedList queue = new Q4_QueueLinkedList();

        int choice;

        do {
            System.out.println("\n===== QUEUE USING LINKED LIST =====");
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Delete)");
            System.out.println("3. Peek (Front Element)");
            System.out.println("4. Display Queue");
            System.out.println("5. Check if Empty");
            System.out.println("6. Show Queue Size");
            System.out.println("7. Search Element");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = input.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;

                case 6:
                    System.out.println(
                        "Current queue size: " + queue.getSize()
                    );
                    break;

                case 7:
                    System.out.print("Enter value to search: ");
                    int searchValue = input.nextInt();
                    queue.search(searchValue);
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