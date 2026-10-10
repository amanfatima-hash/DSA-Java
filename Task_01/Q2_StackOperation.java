import java.util.Scanner;
public class Q2_StackOperation {
   static int[] stack;
   static int top = -1;
   static Scanner sc;

   public Q2_StackOperation() {
   }

   static void push(int var0) {
      if (isFull()) {
         System.out.println("Stack is full!");
      } else {
         ++top;
         stack[top] = var0;
         System.out.println("Value pushed successfully.");
      }
   }

   static void pop() {
      if (isEmpty()) {
         System.out.println("Stack is empty!");
      } else {
         int var0 = stack[top];
         --top;
         System.out.println("Popped value: " + var0);
      }
   }

   static void display() {
      if (isEmpty()) {
         System.out.println("Stack is empty!");
      } else {
         System.out.println("Stack elements (Top to Bottom):");

         for(int var0 = top; var0 >= 0; --var0) {
            System.out.println(stack[var0]);
         }

      }
   }

   static int size() {
      return top + 1;
   }

   static boolean isEmpty() {
      return top == -1;
   }

   static boolean isFull() {
      return top == stack.length - 1;
   }

   public static void main(String[] var0) {
      System.out.print("Enter stack capacity: ");
      int var1 = sc.nextInt();
      stack = new int[var1];

      int var2;
      do {
         System.out.println("\n----- STACK MENU -----");
         System.out.println("1. Push");
         System.out.println("2. Pop");
         System.out.println("3. Display");
         System.out.println("4. Size");
         System.out.println("5. isEmpty");
         System.out.println("6. isFull");
         System.out.println("7. Exit");
         System.out.print("Enter your choice: ");
         var2 = sc.nextInt();
         switch (var2) {
            case 1:
               System.out.print("Enter value: ");
               int var3 = sc.nextInt();
               push(var3);
               break;
            case 2:
               pop();
               break;
            case 3:
               display();
               break;
            case 4:
               System.out.println("Stack size: " + size());
               break;
            case 5:
               System.out.println("Is stack empty? " + isEmpty());
               break;
            case 6:
               System.out.println("Is stack full? " + isFull());
               break;
            case 7:
               System.out.println("Program exited.");
               break;
            default:
               System.out.println("Invalid choice!");
         }
      } while(var2 != 7);

      sc.close();
   }

   static {
      sc = new Scanner(System.in);
   }
}
