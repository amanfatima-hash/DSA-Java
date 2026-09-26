  import  java.util.Scanner;
public class Array10_FindMinimum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of size: ");
        int size=sc.nextInt();
        System.out.println("Enter Numbers:");
        int numbers[]=new  int[size];
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        int min=numbers[0];
         for(int i=0; i<size; i++){
            if( numbers[i] <min){
                min=numbers[i];
            }
         }
         System.out.println("Minimum Number: "+min);
        sc.close();
    }
}
